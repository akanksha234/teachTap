import pageObjects.ExploreScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExploreScreenTest extends AppiumTestBase {
    private ExploreScreen exploreScreen;

    @BeforeMethod
    public void setUpTest() throws Exception {
        super.setup();
        exploreScreen = new ExploreScreen(driver);
    }

    @Test
    public void testCourseListDisplay(){
        String courseTitle = exploreScreen.getCourseTitle();
        Assert.assertTrue(courseTitle.contains("High School Physics"), "Course title is not displayed correctly");

        String progress = exploreScreen.getProgressIndicator();
        Assert.assertTrue(progress.contains("% completed"), "Progress indicator is not diaplayed correctly.");
    }

}
