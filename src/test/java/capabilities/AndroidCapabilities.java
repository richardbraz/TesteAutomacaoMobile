package capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;

public enum AndroidCapabilities {
    ANDROID("resources/capabilities/androidpie.json");

    private String path;

    AndroidCapabilities(String path) {
        this.path = path;
    }

    public DesiredCapabilities getAndroidCapabilitiesFromPlataform() {
        DesiredCapabilities androidCapabilities = Load_Capabilities.pathToDesiredCapabilitites(this.path);
        androidCapabilities.setCapability("app", new File("resources/app/cadastro_clientes_teste.apk").getAbsolutePath());
        return androidCapabilities;
    }

    public static void showAvaliableAndroidDevices() {
        System.out.println("======= ANDROID DEVICES ====== ");
        for (AndroidCapabilities androidCapabilities : AndroidCapabilities.values()) {
            System.out.println(androidCapabilities.name());
        }
    }
}
