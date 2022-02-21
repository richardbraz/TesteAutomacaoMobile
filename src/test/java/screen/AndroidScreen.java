package screen;

import capabilities.DriverFactoryManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class AndroidScreen extends BaseScreen {

    @WithTimeout(time = 2000, unit = TimeUnit.SECONDS)
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")
    private MobileElement BtnAllowPermission;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/grant_dialog")
///hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout

    private MobileElement QuadroDialogo;
    public void SelecionarAllow() throws InterruptedException {
        Thread.sleep(1000);

        new TouchAction(DriverFactoryManager.getDriver()).tap(540,1090).perform();
//        this.findElement(By.xpath(".//android.widget.Button[1]")).click();

    }
}
