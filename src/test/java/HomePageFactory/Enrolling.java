package HomePageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enrolling {
	WebDriver driver;
    public Enrolling(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, this);
   
    }
    
    
    
    @FindBy(xpath="//a[@class='homecardmain ga_trending_course_card' and @data-name='Selenium Certification Training Course']")
    WebElement SelCourse;
    
    @FindBy(xpath="//button[@class='videoinfo_btn_enr_stle__G_pv9 btn btn-primary']")
    WebElement enroll;
    
    @FindBy(xpath="//input[@class='enrollbatchpopup_input__Z_x3w form-control']")
    WebElement EmailId;
    
    @FindBy(xpath="//input[@class='enrollbatchpopup_input__Z_x3w enrollbatchpopup_phone_input__2vddm form-control']")
    WebElement phone;
    
    @FindBy(xpath="//*[@id='firstENForm']/div[5]/button")
    WebElement enrrolling;
    
    
    
    
    
    
    public void scrolls() {
    	JavascriptExecutor javac= (JavascriptExecutor) driver;
    	javac.executeScript("window.scrollBy(0,700)");
    }
    
    public void Selenium() {
    	SelCourse.click();
    }
    
    
    public void enrollnow() {
    	enroll.click();
    }
    
    
  public void email_id(String idd) {
	  EmailId.sendKeys(idd);
  }
  
  public void phoneNo(String phhh) {
	  phone.sendKeys(phhh);
  }
  public void click_enroll() {
	  enrrolling.click();
  }
}
