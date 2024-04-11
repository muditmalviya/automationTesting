package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragandDrop { // More descriptive class name

  @Test
  void testDragAndDrop() throws InterruptedException {
    // Initialize WebDriver (ChromeDriver in this case)
    WebDriver driver = new ChromeDriver();

    try {
      driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

      // Locate the draggable element
      WebElement draggable = driver.findElement(By.id("draggable"));

      // Locate the droppable element
      WebElement droppable = driver.findElement(By.id("droppable"));

      // Perform drag and drop
      draggable.click(); // Click the draggable element first (optional)
      // Uncomment the line below if you don't want to click first
      // driver.findElement(By.id("draggable")).getLocation(); // Get draggable location (alternative)
      
      // Perform drag and drop using Actions (optional, alternative approach)
//      Actions actions = new Actions(driver);
//      actions.dragAndDrop(draggable, droppable).build().perform();

      // Move the draggable element on top of the droppable element (alternative approach)
      int xOffset = droppable.getLocation().getX() - draggable.getLocation().getX();
      int yOffset = droppable.getLocation().getY() - draggable.getLocation().getY();
      
      // Move the draggable element using Actions class (alternative approach)
//      actions.moveByOffset(xOffset, yOffset).perform();
  
      Thread.sleep(2000); // Pause for 2 seconds to simulate drag and drop (replace with your desired logic)
    } catch (Exception e) {
      e.printStackTrace();
      fail("An exception occurred: " + e.getMessage());
    } finally {
      // Close the WebDriver instance
      driver.quit();
    }
  }
}
