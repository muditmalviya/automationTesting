package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class redbus2 {

    public static void main(String[] args) throws InterruptedException {
        // Setting up Chrome driver path
//        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        // Creating a Chrome driver instance
        WebDriver driver = new ChromeDriver();

        // Navigating to the Redbus website
        driver.get("https://www.redbus.in/");

        // Locating the account element
        WebElement account = driver.findElement(By.xpath("(//DIV[@class='rb_main_secondary_item  link'])[2]"));

        // Locating the ticket details element
        WebElement details = driver.findElement(By.id("ticket_details"));

        // Creating an Actions object
        Actions actions = new Actions(driver);

        // Moving to the account element and performing a click
        actions.moveToElement(account).click().perform();
        Thread.sleep(2000);

        // Moving to the details element
        actions.moveToElement(details).perform();
        Thread.sleep(2000);

        // Clicking on the details element
        actions.click(details).perform();

        // Closing the browser
        driver.quit();
    }
}
