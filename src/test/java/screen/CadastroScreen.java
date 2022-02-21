package screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;



import java.util.concurrent.TimeUnit;




public class CadastroScreen extends BaseScreen {


    @WithTimeout(time = 2000, unit = TimeUnit.SECONDS)
    @AndroidFindBy(id = "editNome")
    private MobileElement CampoNome;
    public void preencherNome(){
        this.CampoNome.sendKeys("Richard Braz de Azevedo");
    }

    @AndroidFindBy(id = "editRg")
    private MobileElement CampoRG;
    public void preencherRg(){
        this.CampoRG.sendKeys("963258789");
    }

    @AndroidFindBy(id = "editCpf")
    private MobileElement CampoCPF;
    public void preencherCpf(){
        this.CampoCPF.sendKeys("32145698780");
    }

    @AndroidFindBy(id = "editData")
    private MobileElement CampoData;
    public void preencherData(){
        this.CampoData.sendKeys("02031994");
    }

    @AndroidFindBy(id = "editEndereco")
    private MobileElement CampoEndereço;
    public void preencherEnd(){
        this.CampoEndereço.sendKeys("Avenida Laranjal Paulista");
    }

    @AndroidFindBy(id = "editNumero")
    private MobileElement CampoNmr;
    public void preencherNmr(){
        this.CampoNmr.sendKeys("1000");
    }

    @AndroidFindBy(id = "editBairro")
    private MobileElement CampoBairro;
    public void preencherBairro(){
        this.CampoBairro.sendKeys("Campestre");
    }

    @AndroidFindBy(id = "editCep")
    private MobileElement CampoCEP;
    public void preencherCep(){
        this.CampoCEP.sendKeys("13401630");
    }

    @AndroidFindBy(id = "editCidade")
    private MobileElement CampoCidade;
    public void preencherCidade(){
        this.CampoCidade.sendKeys("Piracicaba");
    }

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.Spinner/android.widget.TextView")
    private MobileElement CampoEstado;
    public void selecionarEstado() throws InterruptedException {
        this.CampoEstado.click();
        Thread.sleep(2000);
        scroll();
        Thread.sleep(1000);
        this.EstadoSP.click();
    }

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]")
    private MobileElement EstadoSP;

    @AndroidFindBy(id = "editTelefone1")
    private MobileElement CampoTelefone1;
    public void preencherTelefone(){
        this.CampoTelefone1.sendKeys("(19)99617-3153");
    }

    @AndroidFindBy(id = "editEmail")
    private MobileElement CampoEmail;
    public void preencherEmail(){
        this.CampoEmail.sendKeys("richardbraz@outlook.com");
    }

    @AndroidFindBy(id = "btnSalvar")
    private MobileElement BtnSalvar;
    public void clicarSalvar(){
        this.BtnSalvar.click();
    }

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    private MobileElement BotãoOK;


}