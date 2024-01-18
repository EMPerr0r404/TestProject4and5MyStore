// package MyStoreWeb;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.FindBy;
// import org.openqa.selenium.support.PageFactory;

// // Page object class representing the main page
// public class StoreMainPage {

//     // WebElement representing the "Sign In" link on the page
//     @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a")
//     private WebElement signIn;

//     // WebElement representing a product (Hummingbird Sweater) on the page
//     @FindBy(css = "#content > section > div > div:nth-child(2) > article > div > div.thumbnail-top > a")
//     private WebElement hummingBirdSweater;

//     // Constructor initializing WebElements when a new instance of this class is created
//     public StoreMainPage(WebDriver driver) {
//         PageFactory.initElements(driver, this);
//     }

//     // Method to click the "Sign In" link on the page
//     public void clickSignIn() {
//         signIn.click();
//     }

//     // Method to click on the Hummingbird Sweater product on the page
//     public void clickHummingSweater() {
//         hummingBirdSweater.click();
//     }
// }
