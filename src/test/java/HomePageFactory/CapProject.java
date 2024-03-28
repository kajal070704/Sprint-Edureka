package HomePageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CapProject {
	WebDriver driver;
    public CapProject(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, this);
   
    }
    
    
    
    @FindBy(xpath="/html/body/div[2]/section[2]/div/div/div[3]/a")
    WebElement dataScientist;
    

    
    @FindBy(xpath="//i[@class='icon-Video_icon']")
    WebElement video;
    @FindBy(xpath="/html/body/div[15]/div/div/div/div/form/div[2]/input")
    WebElement enteremail;
    @FindBy(xpath="/html/body/div[15]/div/div/div/div/form/div[3]/input")
    WebElement enterphno;
    
    @FindBy(xpath="/html/body/div[15]/div/div/div/div/form/button")
    WebElement unlock;
    

    
    
    
    
    
    public void scroll_in() {
    	JavascriptExecutor jsexecuter= (JavascriptExecutor) driver;
    	jsexecuter.executeScript("window.scrollTo(0,100)");
    }
    
    public void clickds() {
    	dataScientist.click();
    }
    public void play_video() {
    	video.click();
    }
    
    public void Enter_email(String data) {
    	enteremail.sendKeys(data);
    }
    public void Enter_phno(String kdata) {
    	enterphno.sendKeys(kdata);
    }
    public void UNLOCK_VIDEO() {
    	unlock.click();
    }
    
    
   
}
