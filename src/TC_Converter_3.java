import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Converter_3 {
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
            
        

            // Locate 1st the text box element
            WebElement dropdownList = driver.findElement(By.xpath("//div[@class='sc-72844c23-4 jPtsuQ']"));
            dropdownList.click();

            WebElement dropdownValue = driver.findElement(By.xpath("//ul[@id='midmarketFromCurrency-listbox']/following::li[Contains(text(),'CAD - Canadian Dollar')]"));
            dropdownValue.click();
          
            // Locate 1st the text box element
            //WebElement dropdownList = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sc-72844c23-4 jPtsuQ']")));
            WebElement dropdownList2 = driver.findElement(By.xpath("//div[@id='midmarketFromCurrency']/following::div[@class='sc-72844c23-4 jPtsuQ'][1]']"));
            dropdownList2.click();

            WebElement dropdownValue2 = driver.findElement(By.xpath("//ul[@id='midmarketFromCurrency-listbox']/following::li[Contains(text(),'AUD - Australian Dollar')]"));
            // Click the button
            dropdownValue.click();

            // Get the text from the text box
            String fromText = dropdownValue.getText().trim();
            String toText = dropdownValue2.getText().trim();

            String actualtext = "CAD - Canadian Dollar";
            String actualtext2 = "AUD - Australian Dollar";

            // Verify droplist updated
            if (fromText.equals(actualtext) && toText.equals(actualtext2)) {
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
