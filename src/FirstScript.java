

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstScript {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\syazan\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        message.getText();

        driver.quit();
    }
}


// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import java.time.Duration;

// public class TC_1 {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");

//         // Set the path to the ChromeDriver executable
//         System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\syazan\\src\\drivers\\chromedriver.exe");

//         // Initialize a Chrome WebDriver
//         WebDriver driver = new ChromeDriver();

//         try {
//             // Navigate to a sample webpage
//             driver.get("https://www.xe.com/");

//             // Wait for the input element to be clickable (max 10 seconds)
//             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//             WebElement textBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='sc-df72c595-1 iWoiSn']")));

//             // Print page title
//             System.out.println("Page Title: " + driver.getTitle());

//             // Get the text from the input element
//             String actualText = textBox.getAttribute("value").trim();
//             System.out.println("Actual Text: " + actualText);

//             // Expected text
//             String expectedText = "1.00";

//             // Verify if the actual text matches the expected text
//             if (expectedText.equals(actualText)) {
//                 System.out.println("Text verification successful: Entered text matches expected text.");
//             } else {
//                 System.out.println("Text verification failed: Entered text does not match expected text.");
//             }

//         } catch (Exception e) {
//             e.printStackTrace();
//         } finally {
//             // Close the browser
//             driver.quit();
//         }
//     }
// }
