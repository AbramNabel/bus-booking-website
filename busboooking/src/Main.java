import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Main
{
    locator loc = new locator();

    @BeforeTest
    public void setup()
    {
       Hooks.driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
    }


    @Test
    void selectRoute()
    {
       WebElement routeSelection = loc.getRoutelocator();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(15000));
        wait.until(ExpectedConditions.visibilityOf(routeSelection));
        routeSelection.click();

    }
    @Test(dependsOnMethods = {"selectRoute"})
    void selectDate()
    {
        WebDriverWait wait2 = new WebDriverWait(Hooks.driver, Duration.ofMillis(10000));

        wait2.until(ExpectedConditions.visibilityOf(loc.DateSelection()));
        loc.DateSelection().click();
    }
    @Test(dependsOnMethods = {"selectDate"})
    void   searchForBus() {
        WebDriverWait waitY= new WebDriverWait(Hooks.driver,Duration.ofSeconds(3));

        waitY.until(ExpectedConditions.visibilityOf(loc.SearchForBus()));
        loc.SearchForBus().click();

    }

    @Test(dependsOnMethods = {"searchForBus"})
    void selectBus()
    {
        WebDriverWait wait3 = new WebDriverWait(Hooks.driver,Duration.ofSeconds(6));

        wait3.until(ExpectedConditions.visibilityOf(loc.SearchForBus()));
        loc.SelectBus().click();
    }


    @Test (dependsOnMethods = {"selectBus"})
    void selectSeat()
    {
        WebDriverWait wait4 = new WebDriverWait(Hooks.driver,Duration.ofMillis(15000));

        wait4.until(ExpectedConditions.visibilityOf(loc.Seat()));
        loc.Seat().click();
    }
    @Test(dependsOnMethods = {"selectSeat"})
    void boardingPoint()
    {

        loc.BoardingPoint().click();
        loc.DroppingPoint().click();
    }
    @Test (dependsOnMethods = {"boardingPoint"})
    void customerDetails()
    {
        WebElement mobileNo= Hooks.driver.findElement(By.xpath("//*[@id=\"mobileNo\"]"));
        mobileNo.click();
        mobileNo.sendKeys("6789125987");
    }


}