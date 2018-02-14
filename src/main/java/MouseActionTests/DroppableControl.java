package MouseActionTests;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DroppableControl
{
    @FindBy(css ="#draggableview > p")
    private WebElement draggableObject;

    @FindBy(css ="#droppableview")
    private WebElement targetArea;

    @FindBy(css ="#ui-id-2")
    private WebElement selectTest2;

    @FindBy(css ="#ui-id-3")
    private WebElement selectTest3;

    @FindBy(css ="#ui-id-4")
    private WebElement selectTest4;

    @FindBy(css ="#ui-id-5")
    private WebElement selectTest5;

    @FindBy(css ="#draggableaccept > p")
    private WebElement dragObjTest2;

    @FindBy(css ="#draggableprop > p")
    private WebElement dragObjTest3;

    @FindBy(css ="#draggablerevert")
    private WebElement dragObjTest4a;
    @FindBy(css ="#draggablerevert2")
    private WebElement dragObjTest4b;

    @FindBy(css ="#ui-id-8")
    private WebElement Tab2Ex5;
    @FindBy(css ="#ui-id-10")
    private WebElement Tab3Ex5;
    @FindBy(css ="#ui-id-7 > ul > li:nth-child(3)")
    private WebElement itemFromTab1;
    @FindBy(css ="#ui-id-9 > ul > li:nth-child(3)")
    private WebElement ItemFromTab2;
    @FindBy(css ="#ui-id-11 > ul > li:nth-child(3)")
    private WebElement ItemFromTab3;

    public WebElement getObjectx()
    {
       return draggableObject;
    }
    public WebElement getObjectForTest2()
    {
        return dragObjTest2;
    }
    public WebElement getObjectForTest3()
    {
        return dragObjTest3;
    }
    public WebElement getObjectForTest4a()
    {
        return dragObjTest4a;
    }
    public WebElement getObjectForTest4b()
    {
        return dragObjTest4b;
    }


    public WebElement getObjectForTest5a()
    {
        return itemFromTab1;
    }
    public WebElement getObjectForTest5b()
    {
        return ItemFromTab2;
    }
    public WebElement getObjectForTest5c()
    {
        return ItemFromTab3;
    }
    public void selectTab2()
    {
        Tab2Ex5.click();
    }
    public void selectTab3()
    {
        Tab3Ex5.click();
    }


    public void selectTask2()
    {
        selectTest2.click();
    }
    public void selectTask3()
    {
        selectTest3.click();
    }
    public void selectTask4()
    {
        selectTest4.click();
    }
    public void selectTask5()
    {
        selectTest5.click();
    }


}
