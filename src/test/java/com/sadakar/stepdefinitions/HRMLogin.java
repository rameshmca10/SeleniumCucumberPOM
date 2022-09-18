package com.sadakar.stepdefinitions;

import java.time.Duration;
import java.util.List;
import com.sadakar.common.BasePage;
import com.sadakar.pageobjects.HRMLoginPOM;

import io.cucumber.java.en.Given;

public class HRMLogin extends BasePage {

	HRMLoginPOM hrm = new HRMLoginPOM();

	@Given("User login to HRM application with UserName and Password")
	public void loginToHRMApp(io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> cells = dataTable.cells();

		driver.findElement(hrm.userNameLocator).sendKeys(cells.get(0).get(0));
		driver.findElement(hrm.passwordLocator).sendKeys(cells.get(0).get(1));
		driver.findElement(hrm.loginButtonLocator).submit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
