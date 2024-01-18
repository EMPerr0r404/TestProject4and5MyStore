// package MyStoreWeb;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.FindBy;
// import org.openqa.selenium.support.PageFactory;

// public class StoreOrderPage {

//     @FindBy(xpath = "//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button")
//     private WebElement continue2;

//     @FindBy(css = "#js-delivery > div > div.delivery-options > div:nth-child(1) > div > span > span")
//     private WebElement selfPickUp;

//     @FindBy(css = "#js-delivery > button")
//     private WebElement continue3;

//     @FindBy(css = "#payment-option-1")
//     private WebElement payByCheck;

//     @FindBy(id = "conditions_to_approve[terms-and-conditions]")
//     private WebElement termsAgreement;

//     @FindBy(css = "#payment-confirmation > div.ps-shown-by-js > button")
//     private WebElement placeOrder;


//     public void clickSelfPickUp() {
//         selfPickUp.click();
//     }
//     public void clickContinue3() {
//         continue3.click();
//     }

//     public StoreOrderPage(WebDriver driver) {
//         PageFactory.initElements(driver, this);
//     }

//     public void clickContinue2() {
//         continue2.click();
//     }

//     public void clickPayByCheck() {
//         payByCheck.click();
//     }
//     public void clickTermsAgreement() {
//         termsAgreement.click();
//     }
//     public void clickPlaceOrder() {
//         placeOrder.click();
//     }



// }
