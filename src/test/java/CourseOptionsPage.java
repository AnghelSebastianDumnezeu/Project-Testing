import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CourseOptionsPage extends PageObject {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[1]/label")
    private WebElement FirstOption;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[2]/label")
    private WebElement SecondOptions;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[3]/label")
    private WebElement ThirdOption;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[4]/label")
    private WebElement FourthOption;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement NextButton3;
    @FindBy(xpath = "/html/body/div/div/h2")
    private WebElement CourseInformationHeader;

    public CourseOptionsPage (WebDriver driver){
        super (driver);
    }

    public void FirstOption(){ FirstOption.click(); }
    public void SecondOption(){
        SecondOptions.click();
    }
    public void ThirdOption(){
        ThirdOption.click();
    }
    public void FourthOption() {
        FourthOption.click();
    }
    public void NextButton3() { NextButton3.click();}
    public String getCourseInformationHeader (){return CourseInformationHeader.getText();}




}
