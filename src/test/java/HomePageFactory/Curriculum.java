package HomePageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Curriculum {
	WebDriver driver;
	WebElement curriculum;
    public Curriculum(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, this);
   
    }

    
    @FindBy(xpath="//div[@class='col-lg-4 col-md-4 col-sm-4 col-xs-6 card_light_box ga_job_role_card']")
    WebElement devops;
        
//    @FindBy(xpath="//button[contains(text(),' DOWNLOAD CURRICULUM ')]")
//    @FindBy(css="section#Enroll_move>div>div>button")
//    WebElement curriculum;
    
    @FindBy(xpath="//*[@id=\"cd_form\"]/div[1]/input")
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
    
    public void scrolling() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    	curriculum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section#Enroll_move>div>div>button")));
    	JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
    	//javascriptExecutor.executeScript("window.scrollBy(0,870)");
    	javascriptExecutor.executeScript("arguments[0].scrollIntoViewIfNeeded()",curriculum);
    	Thread.sleep(5000);
    	curriculum.click();
    	
    }
    
    public void down_curriculum() {
    	//curriculum.click();
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
