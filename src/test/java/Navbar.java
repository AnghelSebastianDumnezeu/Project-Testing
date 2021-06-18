import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navbar extends PageObject{

    @FindBy (xpath = "/html/body/nav/div")
    private WebElement container;
    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement WhatYoullLearn;
    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement Questions;
    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement Instructors;

    // Testare pe Find the Enrollment

    @FindBy (xpath = "//a[@href='routes/enrollment.html']")
    private WebElement Enrollment;

    public Navbar (WebDriver driver) {
        super(driver);
    }

    public void ClickOnContainer(){
        this.container.click();
    }
    public void ClickOnWhatYoullLearn(){
        this.WhatYoullLearn.click();
    }
    public void Questions(){
        this.Questions.click();
    }
    public void Instructors(){
        this.Instructors.click();
    }
    public void Enrollment() { this.Enrollment.click(); }
}
