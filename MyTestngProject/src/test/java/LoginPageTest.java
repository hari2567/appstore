import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class LoginPageTest {
    public WebDriver driver;

    @Test
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qaappstore.ccbp.tech/");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
    @Test(priority = 1)
    public void imageheading(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement heading=driver.findElement(By.className("heading"));
         System.out.println(heading.getText());
         WebElement searchelement=driver.findElement(By.className("search-input"));
         System.out.println(searchelement.isDisplayed());
         WebElement tablist= driver.findElement(By.className("tabs-list"));
         System.out.println(tablist.isDisplayed());


    }
    @Test(priority =2 )
    public void bottomsection() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement applist = driver.findElement(By.className("apps-list"));
        System.out.println(applist.isDisplayed());
        WebElement buttonlink=driver.findElement(By.xpath("//button[text()='Social']"));
        buttonlink.click();
        List<WebElement>items=driver.findElements(By.className("app-item"));
        if(items.size()==10){
            System.out.println(
                    "images are displayed"+items.size()

            );
        }else{
            System.out.println("images are not displayed");
        }

    }
    @Test(priority = 3)
    public void  imagetest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonlink3=driver.findElement(By.xpath("//button[text()='Social']"));
        buttonlink3.click();
        WebElement searchvalue=driver.findElement(By.className("search-input"));
        searchvalue.sendKeys("facebook");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement appimage=driver.findElement(By.className("app-image"));
        System.out.println(appimage.isDisplayed());
        WebElement appheading=driver.findElement(By.className("app-name"));
        System.out.println(appheading.getText());




    }
    @Test(priority = 4)
    public void gamesapp(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonlink4=driver.findElement(By.xpath("//button[text()='Games']"));
        buttonlink4.click();
        WebElement searchvalue2=driver.findElement(By.className("search-input"));
        searchvalue2.sendKeys("subway surf");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement appimage=driver.findElement(By.className("app-image"));
        System.out.println(appimage.isDisplayed());
        WebElement appheading2=driver.findElement(By.className("app-name"));
        System.out.println(appheading2.getText());





    }
    @Test(priority = 5)
    public void nwspage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonlink5=driver.findElement(By.xpath("//button[text()='News']"));
        buttonlink5.click();
        WebElement searchvalue3=driver.findElement(By.className("search-input"));
        searchvalue3.sendKeys("google");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement appimage2=driver.findElement(By.className("app-image"));
        System.out.println(appimage2.isDisplayed());
        WebElement appheading3=driver.findElement(By.className("app-name"));
        System.out.println(appheading3.getText());



    }
    @Test(priority = 6)
    public  void foodapp(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonlink6=driver.findElement(By.xpath("//button[text()='Food']"));
        buttonlink6.click();
        WebElement searchvalue4=driver.findElement(By.className("search-input"));
        searchvalue4.sendKeys("swiggy");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement appimage3=driver.findElement(By.className("app-image"));
        System.out.println(appimage3.isDisplayed());
        WebElement appheading4=driver.findElement(By.className("app-name"));
        System.out.println(appheading4.getText());




    }



}