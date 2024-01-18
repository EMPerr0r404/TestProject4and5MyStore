package MyStoreWeb;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.firefox.FirefoxOptions;


import java.time.Duration;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTask1Steps {
    // WebDriver instance and page objects initialization
    public WebDriver driver;
    private StoreLogInPage logInPage;
    private StoreMainPage mainPage;
    private StoreYourAccPage accPage;
    private StoreYourAddressesPage addressesPage;
    private StoreNewAddressPage newAddressPage;

    // Step for opening the page in the browser
    @Given("Page {string} opened in browser")
    public void pageOpen(String url) {
     // WebDriver initialization and page objects creation
        
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
           
        // FirefoxOptions options = new FirefoxOptions();
        // driver = new FirefoxDriver(options);

        options.addArguments("--headless");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // driver.manage().window().maximize();
        driver.get(url);
        logInPage = new StoreLogInPage(driver);
        mainPage = new StoreMainPage(driver);
        accPage = new StoreYourAccPage(driver);
        addressesPage = new StoreYourAddressesPage(driver);
        newAddressPage = new StoreNewAddressPage(driver);
    }

    @When("Button SignIn clicked")
    public void buttonSignIn() {
        mainPage.clickSignIn();
    }


    @And("Email filled")
    public void emailFilled() {
        logInPage.setFieldEmail();
    }

    @And("Password filled")
    public void passwordFilled() {
        logInPage.setFieldPass();
    }

    @And("Button Sign clicked")
    public void buttonSignClicked() {
        logInPage.submit();
    }

    @And("Address clicked")
    public void addressClicked() {
        accPage.clickAddresses();
    }

    @And("Create new address clicked")
    public void createNewAddressClicked() {
        addressesPage.clickCreateNew();
    }

    @And("Alias {string} field filled")
    public void aliasFieldFilled(String alias) {
        newAddressPage.setFieldAlias(alias);
    }

    @And("Address {string} field filled")
    public void addressAddressFieldFilled(String address) {
        newAddressPage.setFieldAddress(address);
    }

    @And("City {string} field filled")
    public void cityCityFieldFilled(String city) {
        newAddressPage.setFieldCity(city);
    }

    @And("ZipCode {string} field filled")
    public void zipcodeZipCodeFieldFilled(String zipCode) {
        newAddressPage.setFieldPostcode(zipCode);
    }

    @And("Phone {string} field filled")
    public void phonePhoneFieldFilled(String phone) {
        newAddressPage.setFieldPhone(phone);
    }

    @And("Save button clicked")
    public void saveButtonClicked() {
        newAddressPage.clickSave();
    }

    @Then("Check if address expectedAlias equals {string}")
    public void checkIfAddressEquals(String expectedAlias) {
        // Getting the actual Alias value from the page and asserting it
        String actualAlias = addressesPage.getAlias2();
        assertEquals(expectedAlias, actualAlias);
        // Verifying if the actual Alias contains the expected value, otherwise, fail the assertion
        if (!actualAlias.contains(expectedAlias)) {
            Assertions.fail(String.format("Search result should contain: %s, but was: %s", expectedAlias, actualAlias));
        }
    }

    @Then("Check if address Address equals {string}")
    public void checkIfAddressEqualsAddress(String expectedAddress) {
        // Getting the actual Address value from the page and asserting it
        String actualAddress = addressesPage.getAddress2();
        assertThat(actualAddress, containsString(expectedAddress));
        // Verifying if the actual Address contains the expected value, otherwise, fail the assertion
        if (!actualAddress.contains(expectedAddress)) {
            Assertions.fail(String.format("Address should contain: %s, but was: %s", expectedAddress, actualAddress));
        }
    }

    @Then("Check if address City equals {string}")
    public void checkIfAddressCityEqualsCity(String expectedCity) {
        String actualCity = addressesPage.getAddress2();
        assertThat(actualCity, containsString(expectedCity));
        if (!actualCity.contains(expectedCity)) {
            Assertions.fail(String.format("City should contain: %s, but was: %s", expectedCity, actualCity));
        }
    }

    @Then("Check if address Phone equals {string}")
    public void checkIfAddressPhoneEqualsPhone(String expectedPhone) {
        String actualPhone = addressesPage.getAddress2();
        assertThat(actualPhone, containsString(expectedPhone));
        if (!actualPhone.contains(expectedPhone)) {
            Assertions.fail(String.format("Phone should contain: %s, but was: %s", expectedPhone, actualPhone));
        }
    }

    @Then("Check if address ZipCode equals {string}")
    public void checkIfAddressZipCodeEqualsZipCode(String expectedZipCode) {
        String actualZipCode = addressesPage.getAddress2();
        assertThat(actualZipCode, containsString(expectedZipCode));
        if (!actualZipCode.contains(expectedZipCode)) {
            Assertions.fail(String.format("ZipCode should contain: %s, but was: %s", expectedZipCode, actualZipCode));
        }
    }


    @Then("Delete address")
    public void deleteAddress() {
        addressesPage.deleteAddress2();

    }

    @Then("Check if address deleted")
    public void checkIfAddressDeleted() {
        String expectedNotification = "Address successfully deleted!";
        String actualNotification = addressesPage.getNotification().getText();
        assertEquals(expectedNotification, actualNotification);
        if (!actualNotification.contains(expectedNotification)) {
            Assertions.fail(String.format("Expected notification: %s, but was: %s", expectedNotification, actualNotification));
        }
    }

    @Then("Close browser")
    public void closeBrowser() {
        System.out.println("We close the browser, are we not?");

//        driver.quit();
    }
}
