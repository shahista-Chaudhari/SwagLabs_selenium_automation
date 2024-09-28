package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddToCartSteps {

	WebDriver driver = Hooks.driver;
	
	@Given("user click on Add to cart for products")
	public void user_click_on_Add_to_cart_for_products() throws InterruptedException {
		WebElement p1 = driver.findElement(By.xpath("(//button[@id='add-to-cart-sauce-labs-backpack'])[1]"));
		p1.click();
		Thread.sleep(2000);
		
		WebElement p2 = driver.findElement(By.xpath("(//button[@id='add-to-cart-sauce-labs-bike-light'])[1]"));
		p2.click();
		Thread.sleep(2000);
		
		
		WebElement p3 = driver.findElement(By.xpath("(//button[@id='add-to-cart-sauce-labs-bolt-t-shirt'])[1]"));
		p3.click();
		Thread.sleep(2000);
		
		WebElement p4 = driver.findElement(By.xpath("(//button[@id='add-to-cart-sauce-labs-fleece-jacket'])[1]"));
		p4.click();
		Thread.sleep(2000);		
	}

	@And("user clicks on cart button")
	public void user_clicks_on_cart_button() throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		e1.click();
		Thread.sleep(2000);
	}

	@Then("user can view the products in cart")
	public void user_can_view_the_products_in_cart() throws InterruptedException {
		System.out.println("Product 'Sauce Labs Backpack' present in cart:" + driver.getPageSource().contains("Sauce Labs Backpack"));
		System.out.println("Product 'Sauce Labs Bike Light' present in cart:" + driver.getPageSource().contains("Sauce Labs Bike Light"));
		System.out.println("Product 'Sauce Labs Bolt T-Shirt' present in cart:" + driver.getPageSource().contains("Sauce Labs Bolt T-Shirt"));
		System.out.println("Product 'Sauce Labs Fleece Jacket' present in cart:" + driver.getPageSource().contains("Sauce Labs Fleece Jacket"));
		Thread.sleep(2000);
	}
}
