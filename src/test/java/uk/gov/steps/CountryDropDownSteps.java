package uk.gov.steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import uk.gov.pages.SelectNationalityPage;

public class CountryDropDownSteps {

    @Then("I can see following country into dropdown {string}")
    public void iCanSeeFollowingCountryIntoDropdown(String country) {
        String actualCountry = new SelectNationalityPage().selectCountryByName(country);
        Assert.assertEquals(actualCountry,country,"Country name not displayed");
    }
}
