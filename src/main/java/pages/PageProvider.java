package pages;

public class PageProvider {

    public GoogleHomePage getGoogleHomePage() {
        return new GoogleHomePage();
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage();
    }

    public MainTheOpeningBankPage getTheOpeningBankPage() {
        return new MainTheOpeningBankPage();
    }
}
