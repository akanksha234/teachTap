package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExploreScreen {
    private final AppiumDriver<MobileElement> driver;

    @AndroidFindBy(id = " ")
    private MobileElement courseTitle;

    @AndroidFindBy(id = " ")
    private MobileElement progressIndicator;

    @AndroidFindBy(id = " ")
    private MobileElement followButton;

//    @AndroidFindBys(id = " ")
//    private MobileElement unitList;


    public ExploreScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getCourseTitle() {
        return courseTitle.getText();
    }

    public String getProgressIndicator() {
        return progressIndicator.getText();
    }

    public void followCourse() {
        followButton.click();
    }

//    public List<WebElement> getUnitList() {
//        return unitList;
//    }

}
