package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {

    public SearchResultPage checkSearchResultContainsLink(String expectedLink) {
        ElementsCollection coll = $$("#search .g .r > a:not([class])").shouldBe(sizeGreaterThan(0));
        coll.shouldHave(CollectionCondition.anyMatch("", p -> p.getAttribute("href").equals(expectedLink)));
        return this;
    }

    public SearchResultPage clickLinkByText(String text) {
        $(Selectors.byText(text)).click();
        return this;
    }
}
