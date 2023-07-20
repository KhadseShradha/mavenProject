package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SnapdealTest {
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://snapdeal.com/");
	  driver.close();
	  Thread.sleep(3000);
  }
}
