package WebElementsMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetObject {
    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.calculator.net/");

        // Click on the loan link using the method from the StoreObject class
        StoreObject.loan(driver).click();
    }
}
