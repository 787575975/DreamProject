package search;

import Base.CommonAPI;

public class SearchPage extends CommonAPI {
    public void searchMenu(){

        typeOnElementNEnter("#twotabsearchtextbox","books");

        navigateBack();
        // clearField("twotabsearchtextbox");

        typeOnElementNEnter("#twotabsearchtextbox","toys");
        navigateBack();
       // clearField ("twotabsearchtextbox");

        typeOnElementNEnter("#twotabsearchtextbox","iPhone");

    }
}
