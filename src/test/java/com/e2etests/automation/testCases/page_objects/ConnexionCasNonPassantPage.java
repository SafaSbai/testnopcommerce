package com.e2etests.automation.testCases.page_objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

	public class ConnexionCasNonPassantPage {
		public ConfigFileReader configFileReader;

		@FindBy(how = How.ID, using = "Email")
		public static WebElement Admin;

		@FindBy(how = How.ID, using = "Password")
		public static WebElement Password;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Log in')]")
		public static WebElement LogIn;

		@FindBy(how = How.XPATH, using = "//*[@id=\"navbarText\"]/ul/li[3]/a")
		public static WebElement Page;

		public ConnexionCasNonPassantPage() {
			PageFactory.initElements(Setup.getDriver(), this);
			this.configFileReader = new ConfigFileReader();
		}

		/* Methods */
		public void goToUrl() {
			Setup.getDriver().get(configFileReader.getProperties("home.url.NopCommerce"));
		}

		public void fillAdmin(String name) {
			Admin.sendKeys(name);
		}

		public void fillPassword(String pwd) {
			Password.sendKeys(pwd);
		}

		public void clickOnLogIn() throws InterruptedException {
			LogIn.click();
			Thread.sleep(4000);
			
		}

		public void checkPage() {
			String log = Page.getText();
			Assert.assertEquals("Logout", log);
		}

	
}
