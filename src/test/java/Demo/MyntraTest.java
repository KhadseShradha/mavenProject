package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyntraTest {
  @Test
  public void Myntra() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://myntra.com/");
	  driver.close();
	  Thread.sleep(3000);
  }
}
