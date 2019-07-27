import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertHardSoft {
	WebDriver driver;
	SoftAssert a;

	@BeforeClass
	public void setUp1()
	{
		a = new SoftAssert();
		
	}

	@Test
	public void testAssert()
	{
		a.assertEquals(false, true);
		a.assertAll();
	}

	@Test
	void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admodi.ORADEV\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String Title=driver.getTitle();
		System.out.println(Title);
		//	Assert.assertEquals(Title, "Googl","Hinal");
		a.assertEquals(Title, "Google1");
		a.assertEquals(true, true);
		System.out.println("hinal is good girl");
		a.assertAll();
	}
	@AfterClass
	void tearDown()
	{
		
		driver.quit();
		
	}
}
