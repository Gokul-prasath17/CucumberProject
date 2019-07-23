package RegistrationCheck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterCheck {
	WebDriver driver;
	@Given("open demoaut site and choose registration")
	public void open_demoaut_site_and_choose_registration() {
	   System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://demoaut.com");
	   driver.findElement(By.partialLinkText("REGISTER")).click();
	}

	@Given("enter first name as {string} and last name {string}")
	public void enter_first_name_as_and_last_name(String fname, String lname) {
	 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
	 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
	}

	@Given("give your phone number {word}")
	public void give_your_phone_number(String phonenum) {
	   driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phonenum);
	}

	@Given("enter your mail id {string}")
	public void enter_your_mail_id(String mailid) throws InterruptedException {
	   driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(mailid);
	   Thread.sleep(1000);
	}
	
	@When("enter your Address")
	public void enter_your_Address() {
      driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("23,xyz street");
	}
	@When("enter your city {string}")
	public void enter_your_city(String city) {
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
	}

	@When("Select state as {string}")
	public void select_state_as_and_postal_code(String state) {
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
	}
	@When("Select a postal code as {word}")
	public void postalcode(String pcode)
	{
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(pcode);

	}

	@When("choose country through dropdown box as {string}")
	public void choose_country_through_dropdown_box_as(String drop) {
	   WebElement dd=driver.findElement(By.name("country"));
	   Select s=new Select(dd);
	   s.selectByVisibleText(drop);
	}

	@When("enter your user name {string}")
	public void enter_your_user_name(String userid) {
	   driver.findElement(By.id("email")).sendKeys(userid);
	}

	@When("enter your password as {string} and confirm password as {string}")
	public void enter_your_password_as_and_confirm_password_as(String pwd, String confirmpassword) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmpassword);
		driver.findElement(By.name("register")).click();
		driver.close();
	}

}
