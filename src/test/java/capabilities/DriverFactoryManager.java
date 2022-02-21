package capabilities;

import java.net.MalformedURLException;
import java.net.URL;
import capabilities.AndroidCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class DriverFactoryManager {

    private static AppiumDriver<?> Driver;
    private static AppiumDriverLocalService service;


    public static AppiumDriver<?> startDriverByMavenParameter(String mavenEnvironment) {

        if (Driver == null) {

            try {

                if (mavenEnvironment.contains("ANDROID")) {
                    Driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), AndroidCapabilities.valueOf(mavenEnvironment).getAndroidCapabilitiesFromPlataform());
                }

            } catch (IllegalArgumentException e) {
                System.out.println(" ==== AVISO : Por favor selecionar um dos devices abaixo para executar os testes ==== ");
                AndroidCapabilities.showAvaliableAndroidDevices();
                System.exit(1);
            } catch (UnreachableBrowserException e) {
                System.out.println(" ==== AVISO : Please start appium server, use appium in command line. ====");
                System.exit(1);
            } catch (MalformedURLException e) {
                System.out.println(" ==== AVISO : Por favor verifique a url que foi informada para executar os testes. ====");
                System.exit(1);
            }
        }

        return Driver;
    }

    public static AppiumDriver<?> getDriver() {
        return Driver;
    }

    public static void reLaunchApp() {
        if (Driver != null) {
            Driver.launchApp();
        }
    }

    public static void quitDriver() {
        if (Driver != null) {
            Driver.quit();
        }
    }

    public static String getPageHierarchy() {
        return Driver.getPageSource();
    }

    public static void appiumServerUp() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    public static void appiumServerDown() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.stop();
    }

}