package codenboxautomationlab;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CodenBoxAutomation {

	WebDriver driver = new ChromeDriver();
	Random random = new Random();

	@BeforeTest
	public void setup() {

		driver.get("https://codenboxautomationlab.com/practice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

//	@Test(priority = 1)
//	public void loginForm() {
//		WebElement email = driver.findElement(By.xpath("//input[@id='username']"));
//		email.sendKeys("hi@gmail.com");
//
//		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//		password.sendKeys("001122");
//
//		WebElement rememeberMe = driver.findElement(By.xpath("//input[@id='remember']"));
//		rememeberMe.click();
//		WebElement loginButton = driver.findElement(By.xpath("//button[@id='login-button']"));
//		loginButton.click();
//
//		Assert.assertTrue(true);
//
//	}

//	@Test(priority = 1)
//	public void redioButtons() {
//		List<WebElement> radioButtons = driver.findElements(By.name("radioButton"));
//		int ra = random.nextInt(radioButtons.size());
//
//		System.out.println(ra);
//		radioButtons.get(ra).click();
//
//	}
//
//	@Test(priority = 2)
//	public void autoCompleteSelectCountry() throws InterruptedException {
//		WebElement autoCompleteField = driver.findElement(By.id("autocomplete"));
//		int ra1 = random.nextInt(65, 91);
//		Thread.sleep(500);
//		int ra2 = random.nextInt(65, 91);
//
//		//
//		autoCompleteField.sendKeys(String.valueOf((char) ra1 + String.valueOf((char) ra2)));
//
//		// autoCompleteField.sendKeys("sa");
//		Thread.sleep(3000);
//
//		autoCompleteField.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER));
//
//		System.out.println(String.valueOf((char) ra1 + String.valueOf((char) ra2)));
//		System.out.println(Integer.toString(ra1));
//
//	}
//
//	@Test(priority = 3)
//	public void dropDownButtonRandomSelectTest() {
//		WebElement dropDownElement = driver.findElement(By.id("dropdown-class-example"));
//		dropDownElement.click();
//		Select dropDown = new Select(dropDownElement);
//		int ra = random.nextInt(dropDown.getOptions().size());
//		System.out.println(dropDown.getOptions().size());
//		dropDown.selectByIndex(ra);
//		System.out.println(ra);
//
//	}
//
//	@Test(priority = 4)
//	public void selectAllCheckBoxesTest() {
//		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for (int i = 0; i < checkBoxes.size(); i++) {
//			checkBoxes.get(i).click();
//			System.out.println("done " + i);
//
//		}
//
//		// int ra = random.nextInt(checkBoxes.size());
//		System.out.println(checkBoxes.size());
////		dropDown.selectByIndex(ra);
////		System.out.println(ra);
//
//	}
//
//	@Test(priority = 5)
//	public void deSelectAllCheckBoxesTest() {
//		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for (int i = 0; i < checkBoxes.size(); i++) {
//			checkBoxes.get(i).click();
//			System.out.println("done " + i);
//
//		}
//
//		// int ra = random.nextInt(checkBoxes.size());
//		System.out.println(checkBoxes.size());
////		dropDown.selectByIndex(ra);
////		System.out.println(ra);
//
//	}
//
//	@Test(priority = 6)
//	public void selectRandomCheckBoxeTest() {
//		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//
//		int ra = random.nextInt(checkBoxes.size());
//		checkBoxes.get(ra).click();
//		System.out.println("check box Number: " + ra);
//
//	}
//
//	@Test(priority = 7)
//	public void switchWindowTest() throws InterruptedException {
//		WebElement switchWindow = driver.findElement(By.xpath("//button[@onclick='openWindow()']"));
//		switchWindow.click();
//		Set<String> handles = driver.getWindowHandles();
//		List<String> listHandles = new ArrayList<>(handles);
//		driver.switchTo().window(listHandles.get(1));
//		System.out.println(driver.getTitle());
//		Thread.sleep(3000);
//		WebElement TECHNOLOGIESButton = driver.findElement(By.id("menu-item-9675"));
//		TECHNOLOGIESButton.click();
//		Thread.sleep(1000);
//
//		driver.switchTo().window(listHandles.get(0));
//		Thread.sleep(1000);
//	}
//
//	@Test(priority = 8)
//	public void switchTapsTest() throws InterruptedException {
//		WebElement switchTaps = driver.findElement(By.id("opentab"));
//		switchTaps.click();
//		Set<String> handles = driver.getWindowHandles();
//		List<String> listHandles = new ArrayList<>(handles);
//		driver.switchTo().window(listHandles.get(1));
//		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
//		Thread.sleep(3000);
//		driver.switchTo().window(listHandles.get(0));
//		Thread.sleep(1000);
//	}
//
//	@Test(priority = 9)
//	public void AlertDialogTest() throws InterruptedException {
//		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
//		name.sendKeys("ThuAlkfl");
//		Thread.sleep(1000);
//
//		WebElement alertButton = driver.findElement(By.xpath("//input[@id='alertbtn']"));
//		alertButton.click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(1000);
//	}
//
//	@Test(priority = 9)
//	public void AlertDialogTestConfirm() throws InterruptedException {
//		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
//		name.sendKeys("ThuAlkfl");
//		Thread.sleep(1000);
//
//		WebElement alertButton = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
//		alertButton.click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//	}
//
//	@Test(priority = 10)
//	public void tableTest() {
//		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
//
//		List<WebElement> allRows = table.findElements(By.tagName("td"));
//		for (int i = 0; i < allRows.size(); i++) {
//			System.out.println(allRows.get(i).getText());
//		}
//
//	}
//
//	@Test(priority = 11)
//	public void getOnlyInstructorName() {
//		// WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
//		// th: table head, its an element
//		// td: test data, its an element
//		// tr: table row --- th + td.
//		List<WebElement> getInstructorColumn = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/td[1]"));
//		for (int i = 0; i < getInstructorColumn.size(); i++) {
//			System.out.println(getInstructorColumn.get(i).getText());
//		}
//
//	}
//
//	@Test(priority = 12)
//	public void getOnlyCourseName() {
//		List<WebElement> getCourseColumn = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/td[2]"));
//		for (int i = 0; i < getCourseColumn.size(); i++) {
//			System.out.println(getCourseColumn.get(i).getText());
//		}
//
//	}
//
//	@Test(priority = 13)
//	public void getOnlyPricee() {
//		List<WebElement> getPriceColumn = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/td[3]"));
//		for (int i = 0; i < getPriceColumn.size(); i++) {
//			System.out.println(getPriceColumn.get(i).getText());
//		}
//
//	}
//
//	@Test(priority = 14)
//	public void hideAndShowButtonTest() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,1500)");
//		WebElement hideButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
//		
//		WebElement showButton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
//
//		hideButton.click();
//		Thread.sleep(2000);
//		showButton.click();
//
//	}

	
	@Test(priority = 15)
	public void enableAnddisableButtonTest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1900)");
		WebElement disableButton = driver.findElement(By.xpath("//input[@id='disabled-button']"));
		
		WebElement enableButton = driver.findElement(By.xpath("//input[@id='enabled-button']"));

		disableButton.click();
		Thread.sleep(2000);
		enableButton.click();

	}
	@Test(priority = 16)
	public void mouseHoverTest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(1900,2100)");
		WebElement mouseElement = driver.findElement(By.xpath("//button[@id='mousehover']"));
		Actions action =new  Actions(driver);
		action.moveToElement(mouseElement).click().perform();
		WebElement topButton = driver.findElement(By.linkText("Top"));
		WebElement reloadButton = driver.findElement(By.linkText("Reload"));
		Thread.sleep(2000);
		topButton.click();
//		reloadButton.click();
	}

	@Test(priority = 17)
	public void bookCalenderTest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(2100,2200)");
		WebElement bookCalenderButton = driver.findElement(By.linkText("Booking Calendar"));
		bookCalenderButton.click();
		Thread.sleep(2000);
		Set<String> handlers = driver.getWindowHandles();
		List<String> windows = new ArrayList<>(handlers);
		driver.switchTo().window(windows.get(1));
		WebElement getTable = driver.findElement(By.cssSelector(".datepick-one-month.datepick-new-row"));
		
		List <WebElement> getTestData = getTable.findElements(By.tagName("td"));
		for (int i=0 ; i<getTestData.size();i++ )
		{
			System.out.println(getTestData.get(i).getText());
			
		}
		
	}
	
	@Test(priority = 18)
	public void iFrameTest() throws InterruptedException {
		Set<String> handlers = driver.getWindowHandles();
		List<String> windows = new ArrayList<>(handlers);
		driver.switchTo().window(windows.get(0));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(2300,2450)");
		WebElement iFrameElement = driver.findElement(By.cssSelector(".block.large-row-spacer"));
		driver.switchTo().frame(iFrameElement);
		
		driver.findElement(By.cssSelector(".ct-mobile-meta-item.btn-nav-mobile.open-menu")).click();
		Thread.sleep(2000);
			
	}
	
	@AfterTest
	public void endTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
