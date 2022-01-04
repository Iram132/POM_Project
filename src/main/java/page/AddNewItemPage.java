package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AddNewItemPage extends BasePage {

	WebDriver driver;

	public AddNewItemPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.CSS, using = "input[name='categorydata']")WebElement ADD_CATEGORY_FIELD;
	@FindBy(how = How.CSS, using = "input[value='Add category']")WebElement ADD_CATEGORY_BUTTON;
	@FindBy(how = How.CSS, using = "select[name='category']")WebElement CATEGORY_DROP_DOWN_FIELD;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Nevermind')]")WebElement ALERT_DISMISS_ELEMENT;
	// DROP DOWN FIELDS
	@FindBy(how = How.CSS, using = "select[name='due_month']")WebElement MONTH_DROP_DROWN_FIELD;

	public void enterItem(String item) throws InterruptedException {
		int generatedRNumber = BasePage.randomNumGenerator();
		ADD_CATEGORY_FIELD.sendKeys(item + generatedRNumber);
		Thread.sleep(2000);
	}

	public void clickAddButton() throws InterruptedException {
		ADD_CATEGORY_BUTTON.click();
		Thread.sleep(3000);
		
	}

	public void enterItemSecondTime(String item) throws InterruptedException {
		ADD_CATEGORY_FIELD.sendKeys(item);
		Thread.sleep(2000);
	}
	
	public void clickAddButtonSecondTime() throws InterruptedException {
		ADD_CATEGORY_BUTTON.click();
		Thread.sleep(3000);
		ALERT_DISMISS_ELEMENT.click();
	}

// Month DropDown methods

	public void selecJanuary() throws InterruptedException {
		BasePage.dropDown(MONTH_DROP_DROWN_FIELD, "Jan");
		Thread.sleep(3000);
	}

	public void selectFebruary() throws InterruptedException {
		BasePage.dropDown(MONTH_DROP_DROWN_FIELD, "Feb");
		Thread.sleep(2000);
	}

	public void selectMars() throws InterruptedException {
		BasePage.dropDown(MONTH_DROP_DROWN_FIELD, "Mar");
		Thread.sleep(2000);
	}

	public void selectApril() throws InterruptedException {
		BasePage.dropDown(MONTH_DROP_DROWN_FIELD, "Apr");
		Thread.sleep(2000);
	}

	public void selectMay() throws InterruptedException {
		BasePage.dropDown(MONTH_DROP_DROWN_FIELD, "May");
		Thread.sleep(2000);
	}

	public void selectJune() throws InterruptedException {
		BasePage.dropDown(MONTH_DROP_DROWN_FIELD, "Jun");
		Thread.sleep(2000);
	}

	public void selectJuly() throws InterruptedException {
		BasePage.dropDown(MONTH_DROP_DROWN_FIELD, "Jul");
		Thread.sleep(2000);
	}

	public void selectAugust() throws InterruptedException {
		BasePage.dropDown(MONTH_DROP_DROWN_FIELD, "Aug");
		Thread.sleep(2000);
	}

	public void selectSeptember() throws InterruptedException {
		BasePage.dropDown(MONTH_DROP_DROWN_FIELD, "Sep");
		Thread.sleep(2000);
	}

	public void selectOctober() throws InterruptedException {
		BasePage.dropDown(MONTH_DROP_DROWN_FIELD, "Oct");
		Thread.sleep(2000);
	}

	public void selectNovember() throws InterruptedException {
		BasePage.dropDown(MONTH_DROP_DROWN_FIELD, "Nov");
		Thread.sleep(2000);
	}

	public void selectDecember() throws InterruptedException {
		BasePage.dropDown(MONTH_DROP_DROWN_FIELD, "Dec");
		Thread.sleep(2000);
	}
}
