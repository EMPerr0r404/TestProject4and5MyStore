// package MyStoreWeb;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.FindBy;
// import org.openqa.selenium.support.PageFactory;

// // Page object class representing the order confirmation page
// public class StoreOrderConfirmation {

//     // WebElement representing the "Proceed to Checkout" button
//     @FindBy(css = "a.btn.btn-primary")
//     private WebElement proceedToCheckout2;

//     // WebElement representing the order reference
//     @FindBy(css = "#order-reference-value")
//     private WebElement reference;

//     // WebElement representing the order price
//     @FindBy(css = "#content-hook_payment_return > div > div > div > ul > li:nth-child(1) > span > strong")
//     private WebElement price;

//     // Constructor initializing WebElements when a new instance of this class is created
//     public StoreOrderConfirmation(WebDriver driver) {
//         PageFactory.initElements(driver, this);
//     }

//     // Method to get the order reference --- everything after last space
//     public String getReference() {
//         String fullText = reference.getText();
//         return fullText.substring(reference.getText().lastIndexOf(" ") + 1);
//     }

//     // Method to get the order price
//     public String getPrice() {
//         return price.getText();
//     }
// }
