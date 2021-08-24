package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Fill_Information_StepDefination {
	
		//System.setProperty("webdriver.chromedriver","./driver/chrome.driver.exe");
		WebDriver driver=new ChromeDriver();
		@Given("^User is on ANZ calculator page\\.$")
		public void user_is_on_ANZ_calculator_page() throws Throwable {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		}

		@Then("^User select  Application Type\\.$")
		public void user_select_Application_Type() throws Throwable {
			driver.findElement(By.id("application_type_single")).click();
		}

		@Then("^User select  Number of dependents$")
		public void user_select_Number_of_dependents() throws Throwable {
			Select Dependants=new Select(driver.findElement(By.xpath("//select[@title='Number of dependants']")));
			Dependants.selectByVisibleText("0");
		}

		@Then("^user  Select Property would you like to buy$")
		public void user_Select_Property_would_you_like_to_buy() throws Throwable {
			driver.findElement(By.id("borrow_type_home")).click();
		}

		@Then("^Enter   Your Income$")
		public void enter_Your_Income() throws Throwable {
			driver.findElement(By.id("q2q1i1")).sendKeys("$80,000");
		}

		@Then("^Enter  Your Other Income$")
		public void enter_Your_Other_Income() throws Throwable {
			driver.findElement(By.id("q2q2i2")).sendKeys("$10,000");
		}

		@Then("^Enter  living Expenses$")
		public void enter_living_Expenses() throws Throwable {
			driver.findElement(By.id("expenses")).sendKeys("$500");
		}

		@Then("^Enter current home loan repayments$")
		public void enter_current_home_loan_repayments() throws Throwable {
			driver.findElement(By.id("homeloans")).sendKeys("$0");
		}

		@Then("^Enter  other loan repayments$")
		public void enter_other_loan_repayments() throws Throwable {
			driver.findElement(By.id("otherloans")).sendKeys("$100");
		}

		@Then("^Enter other commitments\\.$")
		public void enter_other_commitments() throws Throwable {
			driver.findElement(By.id("q3q4i2")).sendKeys("0");
			
		}

		@Then("^Enter  total credit card limits$")
		public void enter_total_credit_card_limits() throws Throwable {
			driver.findElement(By.id("credit")).sendKeys("$10,000");
		}

		@Then("^click on Work out how much I could borrow Button$")
		public void click_on_Work_out_how_much_I_could_borrow_Button() throws Throwable {
			driver.findElement(By.id("btnBorrowCalculater")).click();
		}

		@Then("^click on Start Over Button\\.$")
		public void click_on_Start_Over_Button() throws Throwable {
			driver.findElement(By.xpath("//*[@class='start-over']")).click();
		}

		@Then("^Enter living Expenses Text field\\.$")
		public void enter_living_Expenses_Text_field() throws Throwable {
			driver.findElement(By.id("expenses")).sendKeys("$1");
		}
		@Then("^click on Work out how much I could borrow Button$")
		public void click_on_Work_out_how_much_I_could_borrow_Button1() throws Throwable {
			driver.findElement(By.id("btnBorrowCalculater")).click();
		}
		@Then("^click on Start Over Button\\.$")
		public void click_on_Start_Over_Button1() throws Throwable {
			driver.findElement(By.xpath("//*[@class='start-over']")).click();
		}
}