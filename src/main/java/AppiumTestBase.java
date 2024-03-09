import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AppiumTestBase {
    protected AppiumDriver<MobileElement> driver;

    public void setup() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "YourAndroidVersion"); // Replace with actual version
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.APP, "D:\\teachTap\\src\\teach-tap.apk"); // Ensure path is correct
        caps.setCapability(MobileCapabilityType.NO_RESET, true);
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);

        try {
            driver = new AppiumDriver<>(new URL("http://192.168.0.109:4723/wd/hub"), caps);
        } catch (Exception e) {
            throw new RuntimeException("Appium driver could not be initialised for device.", e);
        }
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public AppiumDriver<MobileElement> getDriver() {
        return driver;
    }
}
