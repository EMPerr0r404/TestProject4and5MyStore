package MyStoreWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Page object class representing the page for adding a new address
public class StoreNewAddressPage {

    // WebElement representing the alias input field
    @FindBy(id = "field-alias")
    private WebElement alias;

    // WebElement representing the address input field
    @FindBy(id = "field-address1")
    private WebElement address1;

    // WebElement representing the city input field
    @FindBy(id = "field-city")
    private WebElement city;

    // WebElement representing the phone input field
    @FindBy(id = "field-phone")
    private WebElement phone;

    // WebElement representing the postcode input field
    @FindBy(id = "field-postcode")
    private WebElement postcode;

    // WebElement representing the "Save" button
    @FindBy(css = "#content > div > div > form > footer > button")
    private WebElement save;

    // Constructor initializing WebElements when a new instance of this class is created
    public StoreNewAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Method to set the alias input field with the provided value
    public void setFieldAlias(String providedAlias) {
        alias.sendKeys(providedAlias);
    }

    // Method to set the city input field with the provided value
    public void setFieldCity(String providedCity) {
        city.sendKeys(providedCity);
    }

    // Method to set the postcode input field with the provided value
    public void setFieldPostcode(String providedPostcode) {
        postcode.sendKeys(providedPostcode);
    }

    // Method to set the phone input field with the provided value
    public void setFieldPhone(String providedPhone) {
        phone.sendKeys(providedPhone);
    }

    // Method to set the address input field with the provided value
    public void setFieldAddress(String providedAddress) {
        address1.sendKeys(providedAddress);
    }

    // Method to click the "Save" button
    public void clickSave() {
        save.click();
    }
}