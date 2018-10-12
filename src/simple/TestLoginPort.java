package simple;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestLoginPort {

	//	@Test
	//	public static void testGrid() throws Exception {
	//	URL remoteAddress = new URL("http://localhost:4444/wd/hub");
	//	DesiredCapabilities capabilities=new DesiredCapabilities();
	//	capabilities.setBrowserName("chrome");
	//	WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
	//	driver.close();


	@Test
	public void testrGrid() throws Exception {
//		String ip="192.168.43.136";
//		String browser="chrome";
		URL remoteAddress = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(remoteAddress,capabilities);
		driver.get("https://demo.actitime.com/login.do");
		driver.close();


	}
}
