package keyword;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qait.automation.HRIS.Base;

public class TESTNG {

	WebDriver driver;

	@BeforeClass
	public void launch() {
		Base obj = new Base();
		driver = obj.getdriver();
		Openhris obj1 = new Openhris(driver);
		obj1.open_hris();
	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
		Userlogin obj = new Userlogin(driver);
		obj.action("mohammadrizwan", "**********");////enter password
		System.out.println("login successfully");
		obj.logout();
	}

	@Test(priority = 2)
	public void login2() throws InterruptedException {
		Userlogin obj = new Userlogin(driver);
		obj.action("rasdasd", "asdasd");
		System.out.println("login failed");
	}

	@Test(priority = 3)
	public void login3() throws InterruptedException {
		Userlogin obj = new Userlogin(driver);
		obj.action("", "");
		System.out.println("login failed");
	}
	@Test(priority = 4)
	public void login4() throws InterruptedException {
		Userlogin obj = new Userlogin(driver);
		obj.action("mohammadrizwan", "");
		System.out.println("login failed");
	}
	@Test(priority = 5)
	public void login5() throws InterruptedException {
		Userlogin obj = new Userlogin(driver);
		obj.action("", "pass@w0rd");
		System.out.println("login failed");
    }
}