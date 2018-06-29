package keyword;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Openhris extends Base{
	public Openhris(WebDriver driver)
	{
		this.driver = driver;
	}
	public void open_hris()
	{
	driver.get("https://hris.qainfotech.com/login.php");
	String pagetitle = driver.getTitle();
	Assert.assertEquals("HRIS Login", pagetitle );
	System.out.println("Pagetitle verified");
	}

}
