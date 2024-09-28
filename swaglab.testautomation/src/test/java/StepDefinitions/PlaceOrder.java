package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PlaceOrder {

	WebDriver driver = Hooks.driver;
	
	@Given("user clicks on checkout button")
	public void user_clicks_on_checkout_button() throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//button[@id='checkout']"));
		e1.click();
		Thread.sleep(2000);
	}

	@And("user enters firstname, lastname and zip code")
	public void user_enters_firstname_lastname_and_zip_code() throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//input[@id='first-name']"));
		e1.sendKeys("Ramesh");
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.xpath("//input[@id='last-name']"));
		e2.sendKeys("Verma");
		Thread.sleep(2000);
		WebElement e3 = driver.findElement(By.xpath("//input[@id='postal-code']"));
		e3.sendKeys("78912");
		Thread.sleep(2000);
	}

	@And("user clicks on continue and finish button")
	public void user_clicks_on_continue_and_finish_button() throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//input[@id='continue']"));
		e1.click();
		Thread.sleep(2000);
		
		WebElement e2 = driver.findElement(By.xpath("//button[@id='finish']"));
		e2.click();
		Thread.sleep(2000);
	}

	@Then("user can see the message Thank you for your order")
	public void user_can_see_the_message_thank_you_for_your_order() throws InterruptedException {
		System.out.println("Order placed successfully? "+ driver.getPageSource().contains("Thank you for your order!"));
		Thread.sleep(2000);
	}
}

