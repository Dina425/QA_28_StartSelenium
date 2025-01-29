import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Homework {
    WebDriver wd;
@BeforeClass
    public void setUP(){
        wd=new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }
    @Test
    public void cssLocators(){
        WebElement h1=wd.findElement(By.tagName("h1"));
        List <WebElement> listA=wd.findElements(By.tagName("a"));
        WebElement div= wd.findElement(By.tagName("div"));
        WebElement button = wd.findElement(By.tagName("button"));
        WebElement input = wd.findElement(By.tagName("input"));
        WebElement form = wd.findElement(By.tagName("form"));
        wd.quit();

    }

}
