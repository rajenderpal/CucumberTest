package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefTest {
	ChromeDriver driver;

	@Given("User open chrome browser")
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

	}

	@When("Open gmail url")
	public void openGmail() {
		driver.get("https://www.gmail.com");
	}

	@When("^Enter user (.*) and (.*)$")
	public void enterData(String name, String pswd) {
		System.out.println("user name  " + name);
		System.out.println("user pswd  " + pswd);

	}

	@Then("Close browser")
	public void closeBrowser() {
		driver.close();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before
	public void openChrome() {
		System.out.println("I open  browser");
	}

	@After
	public void closeChrome() {
		System.out.println("I close browser");
	}
}
