package pages;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleHomePage {

    public GoogleHomePage openPage() {
        open("https://www.google.com/");
        return this;
    }

    public GoogleHomePage searchWithGoogleByText(String increment) {
        $(byCssSelector("[autocapitalize]")).setValue(increment).pressEnter();
        return this;
    }
}
