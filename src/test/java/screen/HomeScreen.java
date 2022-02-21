package screen;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import java.util.concurrent.TimeUnit;



public class HomeScreen extends BaseScreen {

    @WithTimeout(time = 3000, unit = TimeUnit.SECONDS)
    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton")
    private MobileElement BtnOpção;
    public void acessarOpcoes() throws InterruptedException {
        this.BtnOpção.isDisplayed();
        Thread.sleep(2000);
        this.BtnOpção.click();

    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
    private MobileElement BtnNovoUsuário;
    public void acessarNovoUsuario() throws InterruptedException {
        Thread.sleep(2000);
        this.BtnNovoUsuário.click();
    }

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
    private MobileElement BtnExportarDados;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]")
    private MobileElement BtnSobreOApp;
    public void AcessarInfo() throws InterruptedException {
        Thread.sleep(2000);
        this.BtnSobreOApp.click();
    }

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton[4]")
    private MobileElement BtnFechar;


    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView")
    private MobileElement TxtPrincipal;
    public void PgnPrincipal() throws InterruptedException {
        this.TxtPrincipal.isDisplayed();
        Thread.sleep(500);
    }
}
