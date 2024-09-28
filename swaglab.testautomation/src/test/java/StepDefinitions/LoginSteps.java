package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = Hooks.driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		if(driver.getCurrentUrl().contains("saucedemo")) {
			System.out.println("Present on login page");
		}
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//input[@id='user-name']"));
		e1.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.xpath("//input[@id='password']"));
		e2.sendKeys("secret_sauce");
		Thread.sleep(2000);
	}

	@And("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//input[@id='login-button']"));
		e1.click();
		Thread.sleep(2000);
	}

	@Then("user is redirected to home page")
	public void user_is_redirected_to_home_page() throws InterruptedException {
		if(driver.getCurrentUrl().contains("inventory.html")) {
			System.out.println("Login successful!");
		}
		else {
			System.out.println("Login fail!");
		}
		Thread.sleep(2000);
	}

}
