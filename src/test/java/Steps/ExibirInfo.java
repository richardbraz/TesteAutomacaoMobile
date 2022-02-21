package Steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import screen.AndroidScreen;
import screen.CadastroScreen;
import screen.HomeScreen;
import screen.InfoScreen;

public class ExibirInfo {

    CadastroScreen Cadastro;
    HomeScreen Home;
    InfoScreen Info;
    AndroidScreen Allow;

    public ExibirInfo() {
        Home = new HomeScreen();
        Cadastro = new CadastroScreen();
        Info = new InfoScreen();
        Allow = new AndroidScreen();
    }

//    @Dado("que estou na tela principal do app")
//    public void queEstouNaTelaPrincipalDoApp() {
//    }
//
//    @Quando("^clicar no botão opções")
//    public void clicarNoBotãoOpções() throws Throwable {
//        this.Home.acessarOpcoes();
//    }
//
    @E("^clicar na opção Sobre o app$")
    public void clicarNaOpçãoSobreOApp() throws Throwable {
        this.Home.AcessarInfo();
    }

    @E("^o app avança para a tela de informações$")
    public void OappAvançaParaATelaDeInformações() throws Throwable {
        this.Info.validarImg();
        Thread.sleep(1000);

    }

    @E("^quando eu fizer o swipe para retornar$")
    public void QuandoEuFizerOSwipeParaRetornar() throws InterruptedException {
        this.Info.ValidarTexto();
        Thread.sleep(1000);
    }

    @Então("^o app retorna para a tela principal$")
    public void OAppRetornaParaATelaPrincipal() throws InterruptedException {
        this.Home.PgnPrincipal();

    }

}
