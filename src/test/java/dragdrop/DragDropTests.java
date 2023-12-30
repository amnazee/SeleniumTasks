package dragdrop;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DragDropTests extends BaseTest {
    @Test
    public void testDragDrop(){
        var dragDrop = homePage.clickDragDrop();
        dragDrop.DragAndDrop();
    }
}