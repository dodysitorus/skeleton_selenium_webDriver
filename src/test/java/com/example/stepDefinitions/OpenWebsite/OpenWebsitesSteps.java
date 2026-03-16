package com.example.stepDefinitions.OpenWebsite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.Utility.DriverFactory;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class OpenWebsitesSteps {
    @Given("[user] opens website using the endpoint {string}")
    public void userOpensWebsiteUsingTheEndpoint(String url) {
        DriverFactory.getDriver().get(url);
    }

    @When("[user] verify the current url of website contains {string}")
    public void userVerifyTheCurrentUrlOfWebsiteContains(String expectedUrl) {
        String actualUrl = DriverFactory.getDriver().getCurrentUrl();
        assertThat("Wrong assertion for current url website", actualUrl, containsString(expectedUrl));
    }
}
