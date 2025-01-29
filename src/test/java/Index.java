import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;
    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("file:///Users/dinabazenova/Downloads/21.index.html");
    }
    @Test
    public void tableTest(){
        WebElement canada=wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals( canada.getText(), "Canada");
    }
    @Test
    public void cssLocators(){
        //search by tagnames
        WebElement button = wd.findElement(By.tagName("button"));
        WebElement a= wd.findElement(By.tagName("a"));
        List <WebElement> listA=wd.findElements(By.tagName("a"));
        WebElement form =wd.findElement(By.tagName("form"));
        WebElement button1= wd.findElement(By.cssSelector("button"));

        WebElement div2=wd.findElement(By.className("container"));
        WebElement div3=wd.findElement(By.cssSelector(".container"));
        List <WebElement> list_a=wd.findElements(By.className("nav-item"));
        List <WebElement> list_a1=wd.findElements(By.cssSelector(".nav-item"));

        WebElement nav= wd.findElement(By.id("nav"));
        WebElement nav1= wd.findElement(By.cssSelector("#nav"));
        WebElement form1= wd.findElement(By.id("form1"));
        WebElement form2= wd.findElement(By.cssSelector("#form1"));


        WebElement inputEmail= wd.findElement(By.cssSelector("[placeholder ='Type your name']"));
        WebElement inputEmail1= wd.findElement(By.cssSelector("[placeholder ^='Type']"));
        WebElement inputEmail2= wd.findElement(By.cssSelector("[placeholder $='name']"));
        WebElement inputEmail3= wd.findElement(By.cssSelector("[placeholder *='your']"));

        WebElement a2= wd.findElement(By.cssSelector("[href='#item3']"));


        WebElement inputS= wd.findElement(By.name("surename"));
        WebElement inputs1= wd.findElement(By.cssSelector("[name='surename']"));

        WebElement a3= wd.findElement(By.linkText("Item 1"));
        WebElement a4=wd.findElement(By.partialLinkText("m 1"));



    }
}
