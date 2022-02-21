package screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import java.util.concurrent.TimeUnit;

public class InfoScreen extends BaseScreen {

    @WithTimeout(time = 3000, unit = TimeUnit.SECONDS)
    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ImageView")
    private MobileElement ImgDudesTecnologia;
    public void validarImg() throws InterruptedException{
        this.ImgDudesTecnologia.isDisplayed();
        Thread.sleep(2000);
    }

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView")
    private MobileElement TxtPagina;
    public void ValidarTexto() throws InterruptedException{
        this.TxtPagina.isDisplayed();
        Thread.sleep(2000);
        swipe();
    }

}
