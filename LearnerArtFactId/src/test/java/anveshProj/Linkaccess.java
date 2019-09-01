package anveshProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Linkaccess {
	
	public static WebDriver driver;
	String link1= "";


@Given("^the link \"([^\"]*)\"$")
public void the_link(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
	link1 = arg1;
//	System.out.println("this is given block");
}

@When("^the user opens a broweser$")
public void the_user_opens_a_broweser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
	System.setProperty("webdriver.chrome.driver", "C:/Users/bhupatpx/Desktop/Tools/LearnerJP/drivers/chromedriver.exe");
	driver = new ChromeDriver();
//	System.out.println("this is When block");
}

@And("^navigates to this Link$")
public void navigates_to_this_Link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
	driver.manage().window().maximize();
	driver.get(link1);
//	System.out.println("this is And  block");
}

@Then("^validate the site is loaded sucessfully$")
public void validate_the_site_is_loaded_sucessfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
	System.out.println("this is Then block");
	Thread.sleep(10000);
	driver.quit();
}
}
