package pages;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleHomePage {

    private By searchField = Selectors.byCssSelector("[autocapitalize]");

    public GoogleHomePage openPage() {
        open("https://www.google.com/");
        return this;
    }

    public GoogleHomePage searchWithGoogleByText(String increment) {
        $(searchField).setValue(increment).pressEnter();
        return this;
    }
}
