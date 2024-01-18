package MyStoreWeb;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class StoreTask2Steps {
    public WebDriver driver;
    private StoreLogInPage logInPage;
    private StoreMainPage mainPage;
    private StoreYourAccPage accPage;
    private StoreHummingbirdPsPage hummPage;
    private StoreShoppingCartPage cartPage;
    private StoreOrderPage storeOrderPage;
    private StoreOrderHistoryPage storeOrderHistoryPage;
    private StoreOrderConfirmation storeOrderConf;
    private Logger logger = Logger.getLogger(StoreTask2Steps.class.getName());

    @Given("Page {string} opened in browser2")
    public void openPage(String url) {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
           
        // FirefoxOptions options = new FirefoxOptions();
        // driver = new FirefoxDriver(options);

        options.addArguments("--headless");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // driver.manage().window().maximize();
        driver.get(url);
       
        logger.info("Opening page: " + url);
       
        // Initialize page objects
        logInPage = new StoreLogInPage(driver);
        mainPage = new StoreMainPage(driver);
        accPage = new StoreYourAccPage(driver);
        hummPage = new StoreHummingbirdPsPage(driver);
        cartPage = new StoreShoppingCartPage(driver);
        storeOrderPage = new StoreOrderPage(driver);
        storeOrderConf = new StoreOrderConfirmation(driver);
        storeOrderHistoryPage = new StoreOrderHistoryPage(driver);
    }

    @When("Logged in")
    public void loggedIn() {
        // Perform login action
        logger.info("Logging in");
        mainPage.clickSignIn();
        logInPage.logAndClick();
    }

    @And("MyStore clicked")
    public void mystoreClicked() {
        // Navigate to MyStore
        logger.info("Navigating to MyStore");
        accPage.clickMyStore();
    }

    @And("HUMMINGBIRD PRINTED SWEATER clicked")
    public void hummingbirdPRINTEDSWEATERClicked() {
        // Select a specific item (HUMMINGBIRD PRINTED SWEATER)
        logger.info("Selecting HUMMINGBIRD PRINTED SWEATER");
        mainPage.clickHummingSweater();
    }

    @And("Discount checked")
    public void discountChecked() {
        // Check for discounts
        logger.info("Checking for discounts");
        hummPage.checkDiscount();
    }

    @And("Size {string} chosen")
    public void sizeChosen(String size) {
        // Choose a specific size
        logger.info("Choosing size: " + size);
        hummPage.chooseSize(size);
    }

    @And("Numbers {int} of item chosen")
    public void numbersOfItemChosen(int number) throws InterruptedException {
        // Choose a specific quantity of the item
        logger.info("Choosing quantity: " + number);
        hummPage.set5quantity(number);
    }

    @And("Item added to cart")
    public void itemAddedToCart() {
        // Add the item to the shopping cart
        logger.info("Adding item to cart");
        hummPage.clickAddToCart();
    }

    @And("Proceed to checkout clicked")
    public void proceedToCheckoutClicked() {
        // Proceed to the checkout process
        logger.info("Proceeding to checkout");
        hummPage.clickProceedToCheckout();
    }

    @And("Proceed to checkout clicked2")
    public void proceedToCheckoutClicked2() {
        // Proceed to the second step of checkout
        logger.info("Proceeding to checkout (Step 2)");
        cartPage.clickProceedToCheckout2();
    }

    @And("Continue clicked")
    public void continueClicked() {
        // Click the "Continue" button
        logger.info("Clicking Continue");
        storeOrderPage.clickContinue2();
    }

    @And("Pick up in store chosen")
    public void pickUpInStoreChosen() {
        // Choose the option to pick up the order in-store
        logger.info("Choosing pick up in store");
        storeOrderPage.clickSelfPickUp();
    }

    @And("Continue to payment clicked")
    public void continueToPaymentClicked() {
        // Proceed to the payment step
        logger.info("Proceeding to payment");
        storeOrderPage.clickContinue3();
    }

    @And("Pay by check chosen, and agreed to terms")
    public void payByCheckChosenAndAgreedToTerms() {
        // Choose payment by check and agree to the terms
        logger.info("Choosing payment by check and agreeing to terms");
        storeOrderPage.clickPayByCheck();
        storeOrderPage.clickTermsAgreement();
    }

    @And("Place order clicked")
    public void placeOrderClicked() {
        // Place the order
        logger.info("Placing the order");
        storeOrderPage.clickPlaceOrder();
    }

    @Then("Check if order have {string} status, same price and same number")
    public void checkIfOrderHaveStatusSamePriceAndSameNumber(String status) {
        // Check if the order details match the expected status, price, and number
        logger.info("Checking order details");
        String price = storeOrderConf.getPrice();
        String reference = storeOrderConf.getReference();
        logInPage.userButtonClick();
        accPage.clickHistory();
        storeOrderHistoryPage.checkData(reference, price, reference, status);
    }

    @Then("Save screenshot")
    public void saveScreenshot() throws IOException {
        // Save a screenshot for evidence
        logger.info("Saving screenshot");
        File tmpScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:", "test", "store2", "store2" + currentDateTime + ".png"));
    }

    @Then("Close browser2")
    public void closeBrowser2() {
        // Close the browser
        logger.info("Closing browser");
        driver.quit();
    }
}
