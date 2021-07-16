import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends PageObject{

    @FindBy (xpath = "/html/body/nav/div")
    private WebElement container;
    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement WhatYoullLearn;
    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement Questions;
    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement Instructors;
    @FindBy (xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement OurInstructorsHeader;

    // Testare pe Find the Enrollment
    @FindBy (xpath = "//a[@href='routes/enrollment.html']")
    private WebElement Enrollment;
    @FindBy (xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement EnrollmentHeader;

    // Virtual, Hybrid, In Person
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement ReadMoreHeader;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement VirtualReadMore;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement VirtualHeader;


    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement VirtualReadHybrid;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement ClickHybrid;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[3]/div/div/h3")
    private WebElement VirtualReadInPerson;
    @FindBy (xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement ClickInPerson;

    @FindBy (xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement FrequentlyAskedQuestionsHeader;

    //Fundamentals
    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement Fundamentals;

    public Homepage(WebDriver driver) {
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
    public String getOurInstructors(){ return OurInstructorsHeader.getText();}
    public void Enrollment() { this.Enrollment.click(); }
    public String getEnrollment(){ return EnrollmentHeader.getText();}
    public String getFrequentlyAskedQuestions(){ return FrequentlyAskedQuestionsHeader.getText();}
    //Virtual, Hybrid, In Person
    public void ClickOnVirtual(){
        Utils.scrollToElement(driver,
                ReadMoreHeader);
        this.VirtualReadMore.click();
    }
    public String getVirtualHeader(){ return VirtualHeader.getText();}

    public void ClickVirtualReturn(){
        Utils.scrollToElement(driver, ReadMoreHeader);
        this.ClickVirtualReturn();

    }
    public void ClickHybrid(){
        Utils.scrollToElement(driver, VirtualReadHybrid);
        this.ClickHybrid.click();
    }
    public void ClickInPerson(){
        Utils.scrollToElement(driver, VirtualReadInPerson);
        this.ClickInPerson.click();
    }
    //Fundamentals
    public void ClickFundamentals(){
        Utils.scrollToElement(driver, Fundamentals);
        this.ClickFundamentals();

    }

}
