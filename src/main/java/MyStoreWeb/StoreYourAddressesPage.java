package MyStoreWeb;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StoreYourAddressesPage {

    @FindBy(css = "#content > div.addresses-footer > a")
    private WebElement createNewAdd;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[2]/a[2]")
    private WebElement deleteAddress2;

    @FindBy(css = "#notifications > div > article > ul > li")
    private WebElement notification;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]/h4")
    private WebElement alias2;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]")
    private WebElement address2;

    public StoreYourAddressesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickCreateNew() {
        createNewAdd.click();
    }

    public void deleteAddress2() {
        deleteAddress2.click();
    }

    public String getAlias2() {
        return this.alias2.getText();
    }

    public String getAddress2() {
        return this.address2.getText();
    }

    public WebElement getNotification() {
        return notification;
    }

//    public void checkAddress(String looked) {
//        String actual = address2.getText();
////            assertThat(actual, containsString(looked));
//        if (!actual.contains(looked)) {
//            Assertions.fail(String.format("search result should contain: %s, but was: %s", looked, actual));
//        }
//    }

    public void notificationEquals() {
        String looked = "Address successfully deleted!";
        String actual = notification.getText();
        assertEquals(looked, actual);
        if (!actual.contains(looked)) {
            Assertions.fail(String.format("search result should contain: %s, but was: %s", looked, actual));
        }
    }
}
