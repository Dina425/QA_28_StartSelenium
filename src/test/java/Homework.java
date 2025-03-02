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
    public void classWork(){
    WebElement el=wd.findElement(By.xpath("//h1/parent::*"));
    WebElement el1=wd.findElement(By.xpath("//h1/parent::div"));
    WebElement el2=wd.findElement(By.xpath("//h1/.."));

    WebElement el3=wd.findElement(By.xpath("//h1/ancestor::*"));//all
    WebElement el4=wd.findElement(By.xpath("//h1/ancestor::div"));//two options
    WebElement el5=wd.findElement(By.xpath("//h1/ancestor::div[2]"));//one

        WebElement el6=wd.findElement(By.xpath("//h1/ancestor-or-self::*"));


    }
    @Test
    public void cssLocators(){
        WebElement h1=wd.findElement(By.tagName("h1"));
        List <WebElement> listA=wd.findElements(By.tagName("a"));
        WebElement div= wd.findElement(By.tagName("div"));
        WebElement button = wd.findElement(By.tagName("button"));
        WebElement input = wd.findElement(By.tagName("input"));
        WebElement form = wd.findElement(By.tagName("form"));
        WebElement body = wd.findElement(By.tagName("body"));
        // by css, class, id,attribute( start mid end)

        WebElement body1 = wd.findElement(By.xpath("//body"));
        WebElement div1= wd.findElement(By.cssSelector("div"));
        WebElement el= wd.findElement(By.xpath("//*[@class='container']"));
        WebElement el1= wd.findElement(By.xpath("//*[@id='root']"));
        WebElement el2= wd.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement el3=wd.findElement(By.xpath("//input[starts-with(@placeholder,'Pa')]"));
        WebElement el4=wd.findElement(By.xpath("//input[contains(@placeholder,'as')]"));
        WebElement h1_2= wd.findElement(By.cssSelector("h1"));
        WebElement h1_1= wd.findElement(By.xpath("//h1"));
        WebElement a= wd.findElement(By.xpath("//a"));


        WebElement el7= wd.findElement(By.className("login_login__3EHKB"));
        WebElement el8= wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement el9= wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));


        WebElement el10= wd.findElement(By.id("root"));
        WebElement el11= wd.findElement(By.cssSelector("#root"));
        WebElement el12= wd.findElement(By.xpath("//*[@id='root']"));
        WebElement a3= wd.findElement(By.xpath("//a[3]"));








        wd.quit();

    }

}
