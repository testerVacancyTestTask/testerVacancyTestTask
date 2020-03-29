package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {

    public SearchResultPage checkSearchResultContainsLink(String expectedLink) {
        Assert.assertTrue($$(byCssSelector("#search .g a"))
                .findBy(Condition.attribute("href")).attr("href").equals(expectedLink));
        return this;
    }

    public SearchResultPage clickLinkByText(String text) {
        $(Selectors.byText(text)).click();
        return this;
    }
}
