import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Converter_1 {
    public static void main(String[] args) {

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\syazan\\src\\drivers\\chromedriver.exe");

        // Initialize a Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to a sample webpage
            driver.get("https://www.xe.com/");

            // Locate the text box element using XPath
            WebElement textBox = driver.findElement(By.xpath("//input[@class='sc-df72c595-1 iWoiSn']"));
            Thread.sleep(5000);
            
            System.out.println("Page Title: " + driver.getTitle());
            Thread.sleep(1000);

            // Verify if the text box is enabled
            if (textBox.isEnabled()) {
                // Get the text from the text box
                String actualText = textBox.getAttribute("value").trim();

                // Expected text
                String expectedText = "1.00";

                // Print the retrieved text
                System.out.println("Actual Text: " + actualText);

                // Verify if the actual text matches the expected text
                if (expectedText.equals(actualText)) {
                    System.out.println("Text verification successful");
                } else {
                    System.out.println("Text verification failed");
                }
            } else {
                System.out.println("Text box is not enabled.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
