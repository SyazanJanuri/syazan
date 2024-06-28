import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\syazan\\src\\drivers\\chromedriver.exe");
        
        // Initialize a Chrome WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.xe.com/");
        
        // Perform any additional actions here if needed
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        
        // Close the driver
        driver.quit();
    }
}
