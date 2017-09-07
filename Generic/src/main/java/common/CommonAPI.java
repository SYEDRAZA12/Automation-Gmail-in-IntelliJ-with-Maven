package common;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap;
import javafx.beans.property.SetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\arfeen\\IdeaProjects\\myAutomation\\Generic\\driver\\chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

       // dr.get("https://www.google.com/gmail/about/");
        dr.navigate().to("https://www.google.com/gmail/about/");
        dr.manage().window().maximize();
        System.out.println(dr.getTitle());
        dr.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
        dr.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("YOUR-EMAIL");
        dr.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
        dr.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("YOUR-PASSWORD");
        dr.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
        dr.findElement(By.xpath("//*[@id=\":3o\"]/div/div")).click();
    }
}
