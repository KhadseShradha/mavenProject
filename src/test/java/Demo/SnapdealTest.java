package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SnapdealTest {
  @Test
  public void f()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://snapdeal.com/");
  }
}
