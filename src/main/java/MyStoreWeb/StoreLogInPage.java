// package MyStoreWeb;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.FindBy;
// import org.openqa.selenium.support.PageFactory;

// // Page object class representing the login page
// public class StoreLogInPage {

//     // WebElements representing elements on the login page
//     @FindBy(id = "field-email")
//     private WebElement fieldEmail;

//     @FindBy(id = "field-password")
//     private WebElement fieldPass;

//     @FindBy(id = "submit-login")
//     private WebElement buttonSubmit;

//     @FindBy(css = "#_desktop_user_info > div > a.account > span")
//     private WebElement userButton;

//     // Constructor initializing WebElements when a new instance of this class is created
//     public StoreLogInPage(WebDriver driver) {
//         PageFactory.initElements(driver, this);
//     }

//     // Method to set the email field with a default value
//     public void setFieldEmail() {
//         fieldEmail.sendKeys("ra@o2.pl");
//     }

//     // Method to set the password field with a default value
//     public void setFieldPass() {
//         fieldPass.sendKeys("bwnG9X9Y.cs2mY6");
//     }

//     // Method to click the submit button
//     public void submit() {
//         buttonSubmit.click();
//     }

//     // Method to log in with default credentials
//     public void logAndClick() {
//         fieldEmail.sendKeys("ra@o2.pl");
//         fieldPass.sendKeys("bwnG9X9Y.cs2mY6");
//         buttonSubmit.click();
//     }

//     // Method to click the user button on the page
//     public void userButtonClick() {
//         userButton.click();
//     }
// }
