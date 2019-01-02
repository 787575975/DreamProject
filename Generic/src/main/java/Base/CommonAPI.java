package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://www.amazon.com/") String url) {
        System.setProperty("WebDriver.Chrome.driver", "‎/Users/dola/IdeaProjects/DreamProject/Path/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to(url);
    }

    //TYPE
    public void typeOnCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void clickOnSearch(){
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input"));
    }


    public void typeOnID(String locator, String value) {
        driver.findElement(By.id(locator)).sendKeys(value);
    }

    public void  typeOnElementNEnter(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            System.out.println("First attempt was not successful");
            try {
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                System.out.println("Second attempt was not successful");
                try {
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }



//        @AfterMethod
//                public void cleanUP(){
//            driver.close();
//        }


            }

        }
    }

    public void navigateBack(){
        driver.navigate().back();
    }


    public void clearField(String locator) {

        driver.findElement(By.id(locator)).clear();

    }
}

