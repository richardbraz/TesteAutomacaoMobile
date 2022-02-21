package Cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import capabilities.DriverFactoryManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumberjvm.AllureCucumberJvm", "pretty"},
        features = "features",
        glue = "Steps",
        tags = {"@TesteCadastroUsuario"}
)

public class CucumberRunnerTest {

    @BeforeClass
    public static void tearUp() {
//        DriverFactoryManager.appiumServerUp();
        DriverFactoryManager.startDriverByMavenParameter(System.getProperty("environment"));
    }

    @AfterClass
    public static void tearDown() {
//        DriverFactoryManager.appiumServerDown();
//        DriverFactoryManager.quitDriver();
    }

}