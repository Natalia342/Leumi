import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElement {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.leumi.co.il/#Home");
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void testFind(){
     //  WebElement element1 = wd.findElement(By.xpath("//*[text()='פרטי']"));
     //   System.out.println(element1);
 //       List<WebElement> elements = wd.findElements(By.cssSelector("li.first>a[title='פרטי']"));
 //       for(WebElement el:elements){
 //           System.out.println(el.getText());
 //       }
 //       System.out.println(elements);
 //       print();
        WebElement element = wd.findElement(By.linkText("פרטי"));
        System.out.println(element.getText());

        //    WebElement element = wd.findElement(By.cssSelector("li.first>a[title='פרטי']"));
 //       System.out.println(element.getText());
    }
 //   public static void print() {
 //       System.out.println("פרטי");
 //   }
    public void pause(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        FluentWait<WebDriver> wait = new FluentWait<>(wd);
//        wait.withTimeout(Duration.ofSeconds(time));
    }

    @AfterMethod
    public void stop() {
        //    wd.quit();
    }
}
