package steps;

import pages.SearchResultPage;

public class SearchResultSteps {

    private SearchResultPage searchResultPage = new SearchResultPage();

    public void verifyThatListContainsCorrectValue(String expected) {
        searchResultPage.assertThatExpectedValueIsOnSearchTop(expected);
    }
}
