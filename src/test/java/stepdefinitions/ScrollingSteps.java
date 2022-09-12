package stepdefinitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.TestBase;

public class ScrollingSteps extends TestBase {

	@Given("user lands on app home page")
	public void user_lands_on_app_home_page() {

		System.out.println("User navigates to homepage");

		List<WebElement> homepageLinks = driver.findElements(By.xpath("//XCUIElementTypeButton"));
		System.out.println("Total available links on app home page : " + homepageLinks.size());

		for (WebElement ele : homepageLinks) {
			System.out.println(ele.getText());

		}

	}

	@When("user clicks on the Scrolling link")
	public void user_clicks_on_the_scrolling_link() {
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Scrolling\"]")).click();
		System.out.println("user lands on Scrolling screen");
		List<WebElement> scrollingScreenLinks = driver.findElements(By.xpath("//XCUIElementTypeStaticText"));
		System.out.println("Total available links on Scrolling Screen : " + scrollingScreenLinks.size());

		for (WebElement el : scrollingScreenLinks) {

			System.out.println(el.getText());
		}

	}

	@When("user clicks on the TableView link")
	public void user_clicks_on_the_table_view_link() {

		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"TableView\"]")).click();

		System.out.println("User lands on TableView screen");

	}

	@Then("user is navigated to TableView scroll page")
	public void user_is_navigated_to_table_view_scroll_page() {

		List<WebElement> tableViewNum = driver.findElements(By.xpath("//XCUIElementTypeStaticText"));

		for (WebElement ele : tableViewNum) {

			System.out.println(ele.getText());

		}

	}

	@Then("User scroll to the bottom of TableView screen")
	public void user_scroll_to_the_bottom_of_table_view_screen() {

		HashMap<String, Object> scrollObject = new HashMap<String, Object>();
		System.out.println("User scrolls to the bootom of screen");
		scrollObject.put("direction", "down");
		scrollObject.put("name", "99");
		driver.executeScript("mobile:scroll", scrollObject);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"99\"]")).click();

	}

	@When("user clicks on the ScrollView link")
	public void user_clicks_on_the_scroll_view_link() {
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"ScrollView\"]")).click();

		System.out.println("User lands on ScrollView screen");

	}

	@Then("user is navigated to ScrollView scroll page")
	public void user_is_navigated_to_scroll_view_scroll_page() {
		List<WebElement> scrollViewNum = driver.findElements(By.xpath("//XCUIElementTypeStaticText"));

		for (WebElement ele : scrollViewNum) {

			System.out.println(ele.getText());

		}
		

	}

	@Then("User scroll to the bottom of ScrollView screen")
	public void user_scroll_to_the_bottom_of_scroll_view_screen() {
		HashMap<String, Object> scrollObject = new HashMap<String, Object>();
		System.out.println("User scrolls to the bootom of  ScrollView screen");
		scrollObject.put("direction", "down");
		scrollObject.put("name", "98");
		driver.executeScript("mobile:scroll", scrollObject);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Horizontal scroll bar, 1 page\"]")).click();
		
		System.out.println("Scrolling Scenario completed");
		

	}

}
