package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //fields that represent element on a page and
    // functions/methods to interact with those elements
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public DragAndDropPage clickDragDrop() {
        clickLink("Drag and Drop");
        return new DragAndDropPage(driver);
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
