package Demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon
{
  @Test
  public void AmazonTest() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	  driver.close();
	  Thread.sleep(3000);
  }
}
