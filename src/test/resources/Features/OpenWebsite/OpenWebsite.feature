@ReusedSteps @OpenWebsiteFeature
Feature: Open Website Feature

  @OpenWebsite
  Scenario: User successfully open website
    Given [user] opens website using the endpoint "https://the-internet.herokuapp.com/"
    When [user] verify the current url of website contains "the-internet.herokuapp"