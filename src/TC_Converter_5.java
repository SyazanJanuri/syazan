import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Converter_5 {
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
            WebElement amount = driver.findElement(By.xpath("//input[@id='amount']"));
            WebElement convertButton = driver.findElement(By.xpath("//div[@class='text-container']/following::button[@class='sc-fe840e0c-0 vAkEN']"));
            

            // Get the text from the text box
            //String fromText = fromBox.getText().trim();
            //String amount1 = amount.getAttribute("value").trim();
            amount.sendKeys("10");

            // Click the button
            convertButton.click();
            Thread.sleep(4000);
            WebElement convertedAmount = driver.findElement(By.xpath("//p[@class='sc-295edd9f-1 jqMUXt']"));
            
            
            String oldAmount = convertedAmount.getText().trim();
            WebElement amount2 = driver.findElement(By.xpath("//input[@id='amount']"));
            amount2.sendKeys(Keys.chord(Keys.CONTROL, "a"), "200");
            Thread.sleep(4000);

            String newAmount = convertedAmount.getText().trim();

            System.out.println(newAmount+oldAmount);
            // Verify switched box
            if (!oldAmount.equals(newAmount)) {
                System.out.println("verification successful");
            } else {
                System.out.println("verification failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            //driver.quit();
        }
    }
}
