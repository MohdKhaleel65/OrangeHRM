package OrangeHrm_Application.OHRM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public WebDriver driver;
	//String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	public FileInputStream excelTestDataFile;
	public FileOutputStream excelTestResultFile;
	public XSSFWorkbook workBook;
	public XSSFSheet workBookSheet;
	
	public FileInputStream elementsPropertiesFile;
	public Properties prop;




	@BeforeTest
	public void setUp() throws IOException
	{
		elementsPropertiesFile =new FileInputStream("./src/main/java/com/OHRM/config/OHRM_Login.properties");
	System.setProperty("webdriver.chrome.driver", "./DriverFiles1/chromedriver.exe");
	prop =new Properties();
	prop.load(elementsPropertiesFile);

	driver = new ChromeDriver();
	driver.get(prop.getProperty("OHRMApplicationUrlAddress"));

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterTest
	public void tearDown()
	{
	driver.quit();
	}



}
