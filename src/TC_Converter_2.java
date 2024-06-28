import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Converter_2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\syazan\\src\\drivers\\chromedriver.exe");

        // Initialize a Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to webpage
            driver.get("https://www.xe.com/");

            //get page title
            System.out.println("Page Title: " + driver.getTitle());
            Thread.sleep(1000);
            
        

            // Locate the text box element
            //WebElement switchIcon = wait.until(ExpectedConditions.elementToBeClickable(By.className("sc-64b15396-1 eereUj")));
            WebElement switchIcon = driver.findElement(By.xpath("//button[@aria-label='Swap currencies']"));
            WebElement fromBox = driver.findElement(By.xpath("//div[@id='midmarketFromCurrency-descriptiveText']"));
            WebElement toBox = driver.findElement(By.xpath("//div[@id='midmarketToCurrency-descriptiveText']"));

            // Get the text from the text box
            String fromText = fromBox.getText().trim();
            String toText = toBox.getText().trim();

            // Click the button
            switchIcon.click();

            //locate 2nd
            WebElement fromBox2 = driver.findElement(By.xpath("//div[@id='midmarketFromCurrency-descriptiveText']"));
            WebElement toBox2 = driver.findElement(By.xpath("//div[@id='midmarketToCurrency-descriptiveText']"));
            
            // Get the text from the text box
            String fromText2 = fromBox2.getText().trim();
            String toText2 = toBox2.getText().trim();


            // Verify switched box
            if (fromText.equals(toText2) && toText.equals(fromText2)) {
                System.out.println("verification successful");
            } else {
                System.out.println("verification failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
