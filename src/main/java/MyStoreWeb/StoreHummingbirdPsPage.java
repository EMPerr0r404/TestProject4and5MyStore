package MyStoreWeb;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Page object class representing the product page (Hummingbird Ps)
public class StoreHummingbirdPsPage {

    // WebElement representing the discount percentage on the product page
    @FindBy(css = "span.discount.discount-percentage")
    private WebElement discount;

    // WebElements representing different size options for the product
    @FindBy(xpath = "//*[@id=\"group_1\"]/option[1]")
    private WebElement sizeS;

    @FindBy(xpath = "//*[@id=\"group_1\"]/option[2]")
    private WebElement sizeM;

    @FindBy(xpath = "//*[@id=\"group_1\"]/option[3]")
    private WebElement sizeL;

    @FindBy(xpath = "//*[@id=\"group_1\"]/option[4]")
    private WebElement sizeXl;

    // WebElement representing the quantity input field
    @FindBy(xpath = "//*[@id=\"quantity_wanted\"]")
    private WebElement quantity;

    // WebElement representing the "Add to Cart" button
    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    private WebElement addToCart;

    // WebElement representing the "Proceed to Checkout" button in the cart modal
    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement proceedToCheckout;

    // Constructor initializing WebElements when a new instance of this class is created
    public StoreHummingbirdPsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Method to check if the discount percentage is as expected
    public void checkDiscount() {
        String expectedDiscount = "SAVE 20%";
        String actualDiscount = discount.getText();
        assertEquals(expectedDiscount, actualDiscount);
        if (!actualDiscount.contains(expectedDiscount)) {
            Assertions.fail(String.format("Expected discount: [%s], but was: [%s]", expectedDiscount, actualDiscount));
        }
    }

    // Method to choose a specific size from the available options
    public void chooseSize(String size) {
        switch (size) {
            case "S":
                System.out.println("S");
                sizeS.click();
                break;
            case "M":
                System.out.println("M");
                sizeM.click();
                break;
            case "L":
                System.out.println("L");
                sizeL.click();
                break;
            case "XL":
                System.out.println("XL");
                sizeXl.click();
                break;
            default:
                System.out.println("Wrong - choosing M");
                sizeM.click();
        }
    }

    // Method to set the quantity input field to a specific number after clearing it
    public void set5quantity(int number) throws InterruptedException {
        Thread.sleep(200);
        quantity.sendKeys(Keys.CONTROL, "a");
        quantity.sendKeys(Keys.DELETE, String.valueOf(number));
    }

    // Method to click the "Add to Cart" button
    public void clickAddToCart() {
        addToCart.click();
    }

    // Method to click the "Proceed to Checkout" button in the cart modal
    public void clickProceedToCheckout() {
        proceedToCheckout.click();
    }
}
