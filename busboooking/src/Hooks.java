import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class Hooks
{
    public static EdgeDriver driver;
    @BeforeTest
    public void setUp()
    {
        driver = new EdgeDriver();
        driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        driver.manage().window().maximize();

    }
}
