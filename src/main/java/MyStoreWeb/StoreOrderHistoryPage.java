package MyStoreWeb;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreOrderHistoryPage {

    @FindBy(xpath = "//*[@id=\"content\"]/table/tbody/*")
    public WebElement parentElement;

    public StoreOrderHistoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void checkData(String SystemName, String price, String reference, String status) {
        WebElement orderReference = parentElement.findElement(By.xpath(String.format("//*[contains(text(),'%s')]", SystemName)));
        WebElement orderPrice = parentElement.findElement(By.xpath(String.format("//*[contains(text(),'%s')]/../td[2]", SystemName)));
        WebElement orderStatus = parentElement.findElement(By.xpath(String.format("//*[contains(text(),'%s')]/../td[4]/span", SystemName)));

        String actualReference = orderReference.getText();
        String actualPrice = orderPrice.getText();
        String actualStatus = orderStatus.getText();

        if (!actualReference.contains(reference)) {
            Assertions.fail(String.format("search result should contain: %s, but was: %s", reference, actualReference));

        }
        else System.out.println("OK");

        if (!actualPrice.contains(price)) {
            Assertions.fail(String.format("search result should contain: %s, but was: %s", price, actualPrice));
        }
        else System.out.println("OK");
        if (!actualStatus.contains(status)) {
            Assertions.fail(String.format("search result should contain: %s, but was: %s", status, actualStatus));
        }
        else System.out.println("OK");
    }
}
