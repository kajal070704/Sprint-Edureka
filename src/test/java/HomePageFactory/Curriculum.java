package HomePageFactory;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Curriculum {
	WebDriver driver;
    public Curriculum(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, this);
   
    }

    
    @FindBy(xpath="//div[@class='col-lg-4 col-md-4 col-sm-4 col-xs-6 card_light_box ga_job_role_card']")
    WebElement devops;
        
    @FindBy(xpath="//section[@id='Enroll_move']/div/div[1]/button/i")
    WebElement curriculum;
    
    @FindBy(xpath="//input[@class='form-control cd-email popusreml']")
    WebElement emails;
    
    @FindBy(xpath="//input[@class='form-control popusrphn  cd-mobile']")
    WebElement phno;
    
    @FindBy(id="cd_submit")
    WebElement submit;
    
    @FindBy(xpath="//button[@id='cd-skip-continue']")
    WebElement skips;
    
    
    
    
    
    public void scrol_to() {
    	JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
    	javascriptExecutor.executeScript("window.scrollTo(0,150)");
    }
    
    public void click_devops() {
    	devops.click();
    }
    
    public void scrolling() {
    	JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
    	javascriptExecutor.executeScript("window.scrollTo(0,850)");
    	
    }
    
    public void down_curriculum() {
    	curriculum.click();
    }
//    public void down2_curriculum() {
//    	curriculum2.click();
//    }
    public void writeEmail(String data) {
    	emails.sendKeys(data);
    }
    public void writeph(String nmm) {
    	phno.sendKeys(nmm);
    }
    public void down() {
    	submit.click();
    }
    public void conti() {
    	skips.click();
    }
	
}
