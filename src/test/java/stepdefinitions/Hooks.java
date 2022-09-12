package stepdefinitions;

import java.net.MalformedURLException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.TestBase;

public class Hooks extends TestBase {

	TestBase tbase = new TestBase();

	@Before
	public void initialize() throws MalformedURLException {

		tbase.iOS_setUp();

	}

	@After
	public void quit() {
		//driver.quit();

	}

}
