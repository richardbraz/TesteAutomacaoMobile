package screen;

import capabilities.DriverFactoryManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;


public abstract class BaseScreen extends MobileElement {

    public BaseScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverFactoryManager.getDriver()), this);
    }

    protected void waitForInsvisibilityOfElement(By locator) {
        new WebDriverWait(DriverFactoryManager.getDriver(), 5)
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForVisibilityOfElement(By locator) {

        new WebDriverWait(DriverFactoryManager.getDriver(), 5)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void scroll() {
        new TouchAction(DriverFactoryManager.getDriver()).press(925, 1820).waitAction().moveTo(925, 120).press(925, 1820).waitAction().moveTo(925, 120).press(925, 1820).waitAction().moveTo(925, 120).release().waitAction().perform();
    }

    public static void holdElement(MobileElement mobileElement) {
        new TouchAction(DriverFactoryManager.getDriver()).longPress(mobileElement).perform();
    }

    public static void dataPicker(MobileElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverFactoryManager.getDriver();
        HashMap<String, String> picker = new HashMap<String, String>();
        picker.put("order", "next");
        picker.put("offset", "0.15");
        picker.put("element", ((RemoteWebElement) element).getId());
        js.executeScript("mobile: selectPickerWheelValue", picker);
    }

    public static void swipe() {
        new TouchAction(DriverFactoryManager.getDriver()).press(10, 800).waitAction().moveTo(600, 800).release().perform();
    }

    public static void swipeInvert() {
        new TouchAction(DriverFactoryManager.getDriver()).press(300, 50).waitAction().moveTo(300, 1000).release().perform();
    }

}