package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import screen.AndroidScreen;
import screen.CadastroScreen;
import screen.HomeScreen;


public class CadastroDeUsuario{

    CadastroScreen Cadastro;
    HomeScreen Home;
    AndroidScreen Allow;

    public CadastroDeUsuario() {
        Home = new HomeScreen();
        Cadastro = new CadastroScreen();
        Allow = new AndroidScreen();
    }

    @Dado("que estou na tela principal do app")
    public void queEstouNaTelaPrincipalDoApp() throws InterruptedException {
        this.Allow.SelecionarAllow();

    }

    @Quando("^clicar no botão opções")
    public void clicarNoBotãoOpções() throws Throwable {
        this.Home.acessarOpcoes();
    }

    @Quando("^clicar na opção Cadastrar Novo$")
    public void clicarNaOpçãoCadastrarNovo() throws Throwable {
        this.Home.acessarNovoUsuario();
    }

    @E("^preencher os dados$")
    public void preencherOsDados() throws InterruptedException {
        this.Cadastro.preencherNome();
        Thread.sleep(1000);
        this.Cadastro.preencherRg();
        Thread.sleep(1000);
        this.Cadastro.preencherCpf();
        Thread.sleep(1000);
        this.Cadastro.preencherData();
        Thread.sleep(1000);
        this.Cadastro.preencherEnd();
        Thread.sleep(1000);
        this.Cadastro.preencherNmr();
        Thread.sleep(1000);
        this.Cadastro.preencherBairro();
        Thread.sleep(1000);
        this.Cadastro.preencherCep();
        Thread.sleep(1000);
        this.Cadastro.preencherCidade();
        Thread.sleep(1000);
        this.Cadastro.selecionarEstado();
        Thread.sleep(1000);
        this.Cadastro.preencherTelefone();
        Thread.sleep(1000);
        this.Cadastro.preencherEmail();
        Thread.sleep(1000);
    }

    @E("clicar em salvar")
    public void ClicarEmSalvar() throws InterruptedException {
        Thread.sleep(2000);
        this.Cadastro.clicarSalvar();
        Thread.sleep(3000);
    }

    @Então("^deve criar um usuario no app$")
    public void deveCriarUmUsuarioNoApp(){

    }
}

