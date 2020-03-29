package base;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.PageProvider;

public class BaseUITest {

    @BeforeTest
    public void beforeAnyUiTest() {
        WebDriverRunner.setWebDriver(new ChromeDriver());
    }

    @AfterTest
    public void afterAnyUiTest() {
        WebDriverRunner.closeWebDriver();
    }

    public PageProvider pages() {
        return new PageProvider();
    }
}
