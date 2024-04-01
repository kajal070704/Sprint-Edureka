package StepDefination;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import HomePageFactory.CapProject;
import HomePageFactory.Curriculum;
import HomePageFactory.Enrolling;
import HomePageFactory.Reviews;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationHomePage {
	
	WebDriver driver;
	@Before
	public void setdriver() {
		driver=new ChromeDriver();
		driver.get("https://www.edureka.co/");
	}
	
	@Given("I am on edureka homepage")
	public void i_am_on_edureka_homepage() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver.manage().window().maximize();
		
	    
		
	}

	@When("I scrolling down")
	public void i_scrolling_down() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Curriculum cii=new Curriculum(driver);
		cii.scrol_to();
		
	}

	@When("I click on BECOME A DEVOPS ENGINEER")
	public void i_click_on_become_a_devops_engineer() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Curriculum di=new Curriculum(driver);
		di.click_devops();
		
	}

	@When("I scroll down")
	public void i_scroll_down() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Curriculum dw=new Curriculum(driver);
		dw.scrolling();
		
	}
//	@When("I click on DOWNLOAD CURRICULUM")
//	public void i_click_on_download_curriculum() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		Curriculum dw=new Curriculum(driver);
//		dw.down2_curriculum();
//	}


	@When("I click DOWNLOAD CURRICULUM")
	public void i_click_download_curriculum() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Curriculum sc=new Curriculum(driver);
		sc.down_curriculum();
//		driver.findElement(By.xpath("//*[@id='Enroll_move']/div/div[1]/button")).click();
	}
	
	@When("I enter email as {string}")
	public void i_enter_email_as(String data) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Curriculum tr=new Curriculum(driver);
		tr.writeEmail(data);
		
	}

	@When("I enter phno as {string}")
	public void i_enter_phno_as(String nmm) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Curriculum pn=new Curriculum(driver);
		pn.writeph(nmm);
	}

	@When("I click Start Download")
	public void i_click_start_download() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
		Curriculum dw=new Curriculum(driver);
		dw.down();
	}
	@When("I click skip")
	public void i_click_skip() {
		Curriculum dw=new Curriculum(driver);
		dw.conti();
		
	}


	@Then("Download Completed")
	public void download_completed() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	
//	@When("I click on DOWNLOAD CURRICULUM")
//	public void i_click_on_download_curriculum() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}


//	@When("I am scrollsDown")
//	public void i_am_scrolls_down() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		Curriculum sc=new Curriculum(driver);
//		sc.scrol_to();
//		
//}

	@Then("Download is not completed")
	public void download_is_not_completed() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("I am scrollDown1")
	public void i_am_scroll_down1() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
		CapProject cc= new CapProject(driver);
		cc.scroll_in();
	}

	@When("I click BECOME A DATA SCIENTIST")
	public void i_click_become_a_data_scientist() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		CapProject cad= new CapProject(driver);
		cad.clickds();
	}
	
	@When("I click the play button")
	public void i_click_the_play_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		CapProject cadf= new CapProject(driver);
		cadf.play_video();
	}

	@When("I enter the email as {string}")
	public void i_enter_the_email_as(String data) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		CapProject enter= new CapProject(driver);
		enter.Enter_email(data);
		
	}

	@When("I Enter the phone number as {string}")
	public void i_enter_the_phone_number_as(String kdata) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		CapProject kk= new CapProject(driver);
		kk.Enter_phno(kdata);
	}

	@When("I click on unlock video")
	public void i_click_on_unlock_video() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		CapProject kkb= new CapProject(driver);
		kkb.UNLOCK_VIDEO();
		
	}

	@Then("I am able to play the video")
	public void i_am_able_to_play_the_video() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}




	

	

	

	

	@When("I scroll down to trending couse")
	public void i_scroll_down_to_trending_couse() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
		Enrolling ev=new Enrolling(driver);
		ev.scrolls();
	}

	@When("I click SELENIUM CERTIFICATION TRAINING COURSE")
	public void i_click_selenium_certification_training_course() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Enrolling sc=new Enrolling(driver);
		sc.Selenium();
	}
	@When("I click Enroll")
	public void i_click_enroll() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Enrolling ff=new Enrolling(driver);
		ff.enrollnow(); 
	}
	@When("I enter in enrolling email as {string}")
	public void i_enter_in_enrolling_email_as(String idd) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Enrolling fc=new Enrolling(driver);
		fc.email_id(idd);
		
	}

	@When("I enter in enrolling phno as {string}")
	public void i_enter_in_enrolling_phno_as(String phhh) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Enrolling fm=new Enrolling(driver);
		fm.phoneNo(phhh);
		
	}


	@When("I click Enroll Now")
	public void i_click_enroll_now() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
		Enrolling ell=new Enrolling(driver);
		ell.click_enroll();
	}

	@Then("Enrolling Sucessful")
	public void enrolling_sucessful() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@When("I scroll down to reviews")
	public void i_scroll_down_to_reviews() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Reviews rr=new Reviews(driver);
		rr.homescroll();
	}

	@When("I click VIEW ALL REVIEWS")
	public void i_click_view_all_reviews() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Reviews rd=new Reviews(driver);
		rd.view();
	}

	@Then("I click Read More")
	public void i_click_read_more() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Reviews rsd=new Reviews(driver);
		rsd.reading();
	}

	@Then("reading sucessful")
	public void reading_sucessful() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}



}
