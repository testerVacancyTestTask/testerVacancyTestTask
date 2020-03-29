package pages;

import blocks.InternetBankingExchangingBlock;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class MainTheOpeningBankPage {

    public InternetBankingExchangingBlock getInternetBankingExchangingBlock() {
        $(byClassName("main-page-exchange"));
        return new InternetBankingExchangingBlock();
    }
}
