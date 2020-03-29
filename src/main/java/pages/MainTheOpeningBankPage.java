package pages;

import blocks.InternetBankingExchangingBlock;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.element;

public class MainTheOpeningBankPage {

    public InternetBankingExchangingBlock getInternetBankingExchangingBlock() {
        element(byClassName("main-page-exchange"));
        return new InternetBankingExchangingBlock();
    }
}
