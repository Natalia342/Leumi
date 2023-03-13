import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FindElement {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.leumi.co.il/#Home");
    }
    @Test
    public void testFind(){
        List<WebElement> elements = wd.findElements(By.cssSelector("li.first>a[title='פרטי']"));
        System.out.println(elements.size());

    }

    @AfterMethod
    public void stop() {
        //    wd.quit();
    }
}
