import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class locator

{
    public WebElement getRoutelocator ()
    {
        WebElement routeSelection = Hooks.driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a"));
    return routeSelection;
    }
    public WebElement DateSelection()
    {
        WebElement dateSelection = Hooks.driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[2]/a"));
        return dateSelection;
    }
    public WebElement SearchForBus()
    {
        WebElement searchForBus = Hooks.driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button"));
        return searchForBus;
    }
    public WebElement SelectBus()
    {
        WebElement selectBus = Hooks.driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[1]/div[1]/div[3]/div/input[4]"));
        return selectBus;
    }
    public WebElement Seat()
    {
        WebElement seat = Hooks.driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[4]/div/table/tbody/tr/td/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/ul[4]/li[7]/span"));
        return seat;
    }
    public WebElement BoardingPoint()
    {
        WebElement boardingPoint = Hooks.driver.findElement(By.xpath("//*[@id=\"Forward-1467550949362\"]"));
        return boardingPoint;
    }
    public WebElement DroppingPoint()
    {
        WebElement droppingPoint = Hooks.driver.findElement(By.xpath("//*[@id=\"Forward-1467543003073\"]"));
        return droppingPoint;
    }
}
