package com.project3.revtech.E2E.steps;

import com.project3.revtech.E2E.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserLogoutSteps {

    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page() {
        TestRunner.driver.get("http://localhost:4200/product");
        TestRunner.driver.findElement(By.xpath("//img[@src=\"https://i.postimg.cc/xdm3qnyD/Picture1.png\"]"));
    }
    @When("The user clicks on the logout button")
    public void the_user_clicks_on_the_logout_button() {
        TestRunner.userLogoutPOM.logoutButton.click();
    }
}
