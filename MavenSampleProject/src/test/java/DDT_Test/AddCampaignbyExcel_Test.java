package DDT_Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddCampaignbyExcel_Test {
	
@Test(priority=1)
	public void Myntra() {
		Reporter.log("Myntra executed",true);
	}
	
	
	@Test(priority=8)
	public void Flipkart() {
		Reporter.log("Flipkart executed",true);
	}
	
	@Test(enabled = false)
	public void Meshoo() {
		Reporter.log("Meshoo executed",true);
	}
	
	@Test(enabled =false)
	public void Amazon() {
		Reporter.log("Amazon executed",true);
	}
	
	@Test(enabled = false,priority=7)
	public void Ajio() {
		Reporter.log("Ajio executed",true);
	}
	}


