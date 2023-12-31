// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestsforallproductsonthewebsiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testsforallproductsonthewebsite() {
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().setSize(new Dimension(968, 728));
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
    driver.findElement(By.cssSelector(".inventory_item:nth-child(1) > .inventory_item_description")).click();
    assertThat(driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .inventory_item_desc")).getText(), is("carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection."));
    driver.findElement(By.cssSelector(".inventory_item:nth-child(2) > .inventory_item_description")).click();
    assertThat(driver.findElement(By.cssSelector(".inventory_item:nth-child(2) .inventory_item_desc")).getText(), is("A red light isn\\\'t the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included."));
    driver.findElement(By.cssSelector(".inventory_item:nth-child(3) > .inventory_item_description")).click();
    assertThat(driver.findElement(By.cssSelector(".inventory_item:nth-child(3) .inventory_item_desc")).getText(), is("Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt."));
    driver.findElement(By.cssSelector(".inventory_item:nth-child(4) .inventory_item_desc")).click();
    assertThat(driver.findElement(By.cssSelector(".inventory_item:nth-child(4) .inventory_item_desc")).getText(), is("It\\\'s not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office."));
    driver.findElement(By.cssSelector(".inventory_item:nth-child(5) .inventory_item_desc")).click();
    assertThat(driver.findElement(By.cssSelector(".inventory_item:nth-child(5) .inventory_item_desc")).getText(), is("Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won\\\'t unravel."));
    driver.findElement(By.cssSelector(".inventory_item:nth-child(6) .inventory_item_desc")).click();
    assertThat(driver.findElement(By.cssSelector(".inventory_item:nth-child(6) .inventory_item_desc")).getText(), is("This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton."));
    driver.findElement(By.id("react-burger-menu-btn")).click();
    driver.findElement(By.id("logout_sidebar_link")).click();
  }
}
