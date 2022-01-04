package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import page.AddNewItemPage;
import util.BrowserFactory;

  //@Listeners(util.MyTestNGListeners.class) //Using Listeners on the class level
public class AddNewItemPageTest {

	WebDriver driver;

	@BeforeMethod
	public void init() {
		driver = BrowserFactory.init();

	}

	@Test
	public void userShouldBeAbleToAddNewItem() throws Exception {
		AddNewItemPage addNewItem = PageFactory.initElements(driver, AddNewItemPage.class);
		addNewItem.enterItem("Kwintas");
		addNewItem.clickAddButton();
	}

	@Test(priority=1)
	public void userShouldNotBeAbleToAddADuplicateItem() throws InterruptedException {
		AddNewItemPage addNewItem2 = PageFactory.initElements(driver, AddNewItemPage.class);
		addNewItem2.enterItemSecondTime("Kwintas");
		addNewItem2.clickAddButtonSecondTime();
		
	}

	@Test(priority=2)
	public void userShouldBeAbleToSelectAllMonths() throws InterruptedException {
		AddNewItemPage addNewItem = PageFactory.initElements(driver, AddNewItemPage.class);
		addNewItem.selecJanuary();
		addNewItem.selectFebruary();
		addNewItem.selectMars();
		addNewItem.selectApril();
		addNewItem.selectMay();
		addNewItem.selectJune();
		addNewItem.selectJuly();
		addNewItem.selectAugust();
		addNewItem.selectSeptember();
		addNewItem.selectOctober();
		addNewItem.selectNovember();
		addNewItem.selectDecember();
	}

	 @AfterMethod
	public void tearDown() {
		BrowserFactory.tearDown();
	}

}
