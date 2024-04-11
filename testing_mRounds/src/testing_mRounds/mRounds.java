package testing_mRounds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mRounds {

    public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {

            driver.get("http://localhost:4200/signup");

            // Enter username
            WebElement searchUsernameById = driver.findElement(By.id("username-input"));
            searchUsernameById.sendKeys("muditmalviya");

            // Enter email
            WebElement searchEmailById = driver.findElement(By.id("email-input"));
            searchEmailById.sendKeys("muditmalviya@example.com");

            // Enter password (assuming password field has ID "password-input")
            WebElement passwordInput = driver.findElement(By.id("password-input"));
            passwordInput.sendKeys("your_password");

            // You can add similar logic to enter other required fields

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
//            driver.quit();
        }

    }

}
