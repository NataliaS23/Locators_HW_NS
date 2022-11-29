import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Locators_HW {

    WebDriver wd;

    @BeforeMethod
    public void precondition() {

        wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/css/css_table.asp");

    }

    @Test
    public void test1(){
        //tagName
        wd.findElement(By.cssSelector("iframe"));
        wd.findElement (By.xpath("//iframe"));
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.xpath("//div"));
        wd.findElement(By.cssSelector("body"));
        wd.findElement(By.xpath("//body"));
//=================================================================

        //linkText
        wd.findElement(By.linkText("Table Borders"));
        wd.findElement(By.xpath("//*[text()='Table Borders']"));
       // wd.findElement(By.linkText("Italy"));
        wd.findElement(By.xpath("//*[text()='Italy']"));
        wd.findElement(By.xpath("//*[text()='Tables']"));
//====================================================================
//        //id
         wd.findElement(By.id("customers"));
         wd.findElement(By.cssSelector("#customers"));
         wd.findElement(By.xpath("//*[@id='myAccordion']"));
         wd.findElement(By.xpath("//*[@id='customers']"));
        //==========================================================
        wd.findElement(By.cssSelector("[target='_blank']"));
        wd.findElement(By.xpath("//*[@target='_blank']"));
        wd.findElement(By.xpath("//*[@style='display: none;']"));
//      wd.findElement(By.xpath("//*[starts-with(@style,'dis']")); //doesn't work
//      wd.findElement(By.cssSelector("style^='dis']"));//doesn't work
//      wd.findElement(By.xpath("//*[starts-with(@target,'_bl']"));//doesn't work
//      wd.findElement(By.cssSelector("target^='bl']"));//doesn't work
       wd.findElement(By.cssSelector("[target*='bla']"));
       wd.findElement(By.xpath("//*[contains(@target,'bla')]"));
       wd.findElement(By.cssSelector("[target$='nk']"));

    }

    @AfterMethod
    public void postCondition() {
        wd.close();//closed web
        //wd.quit();//closed brauser
    }


}
