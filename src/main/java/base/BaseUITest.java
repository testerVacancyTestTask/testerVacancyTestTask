package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import pages.PageProvider;

public class BaseUITest {

    @BeforeTest
    public void beforeAnyUiTest() {
        Configuration.browser = "chrome";
    }

    public PageProvider pages() {
        return new PageProvider();
    }
}
