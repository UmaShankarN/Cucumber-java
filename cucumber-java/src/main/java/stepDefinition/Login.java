package stepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
	ChromeDriver driver;
@Given("^Open application with valid URL$")
public void open_application_with_valid_URL() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "F:/New/Softwares/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

//@When("^I enter the valid userName and valid password$")
@When("^I enter the valid \"(.*?)\" and valid \"(.*?)\"$")
public void password(String uname,String pass) throws Throwable {
	driver.findElementById("username").sendKeys(uname);
	driver.findElementById("password").sendKeys(pass);
	driver.findElementByClassName("decorativeSubmit").click();
	
}

@Then("^User should login successfully$")
public void user_should_login_successfully() throws Throwable {
	String loginName = driver.findElementByXPath("//h2[contains(text(), 'Welcome')]").getText();
	System.out.println(loginName);
	if(loginName.contains("Demo Sales Manager"))
	{
		System.out.println("Login is valid");
	}
	else
	{
		System.out.println("Login is invalid");
	}
}

@And("^Close the Browser$")
public void closeBrowser()
{
driver.close();	
}
	
}
