package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage{

    private WebDriver driver;
    private By boxe1=By.id("column-a");
    private By boxe2=By.id("column-b");
    public DragAndDropPage(WebDriver driver){this.driver=driver;}

    public void DragAndDrop(){
        WebElement box1=driver.findElement(boxe1);
        WebElement box2=driver.findElement(boxe2);
        Actions actions=new Actions(driver);
        actions.dragAndDrop(box1,box2).build().perform();
    }
}
