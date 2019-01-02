import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import search.SearchPage;

public class TestHome extends SearchPage {



    @Test

    public void test1(){
        searchMenu();
       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
    }

}
