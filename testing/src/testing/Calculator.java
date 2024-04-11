package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator { // More descriptive class name

  @Test
  void testCalculatorSearch() throws InterruptedException {
    // Initialize WebDriver (ChromeDriver in this case)
    WebDriver driver = new ChromeDriver();

    try {
      driver.get("https://www.calculator.net/");

      // Search for "sadadad" and click "Mortgage Calculator"
      WebElement searchInput = driver.findElement(By.id("calcSearchTerm"));
      searchInput.sendKeys("sadadad");
      driver.findElement(By.linkText("Mortgage Calculator")).click();

      // Add your specific test logic here
      // You can uncomment the relevant commented lines below for reference
      // searchInput.sendKeys("abcd"); // Search again after clicking a link
      // driver.findElement(By.xpath("//SPAN[@class='rbmark'])[2]")).click(); // Click a button using XPath

    } catch (Exception e) {
      e.printStackTrace();
      fail("An exception occurred: " + e.getMessage());
    } finally {
      // Close the WebDriver instance
      driver.quit();
    }
  }
}
