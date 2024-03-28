package HomePageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reviews {

	
	WebDriver driver;
    public Reviews(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, this);
   
    }
    
    
    
    @FindBy(xpath="//a[@class='view_all_reviews']")
    WebElement review;
    
    @FindBy(xpath="//*[@id=\"customereviews\"]/div[1]/div[2]/span/a[1]/i")
    WebElement readmore;
    
    
    
    
    
    
    public void homescroll() {
    	JavascriptExecutor javasrc= (JavascriptExecutor) driver;
    	javasrc.executeScript("window.scrollTo(0,2200)");
    }
    
    public void view() {
    	review.click();
    }
    
    public void reading() {
    	readmore.click();
    }
   
    
    
}
