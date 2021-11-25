package com.mindtree.runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.pageObject.AddCart;
import com.mindtree.pageObject.Cart;
import com.mindtree.pageObject.SignIn;
import com.mindtree.pageObject.Product;
import com.mindtree.pageObject.SearchProduct;
import com.mindtree.pageObject.WishlistPage;
import com.mindtree.pageObject.WriteAReview;
import com.mindtree.pageObject.wishlist;
import com.mindtree.reusableComponents.Webdriver;
import com.mindtree.utilities.DataDriven;

public class bigsmallSite extends Webdriver {
	public static Logger Log = LogManager.getLogger(Webdriver.class.getName());

	@Test(priority = 1)
	public void TestCase1() throws IOException, InterruptedException {
		driver = initializeDriver();
		Log.info("Driver is Initialized");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\config.properties");
		prop.load(fis);
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		Log.info("URL is Opened");
		Thread.sleep(5000);
	}

	@Test(priority = 2, dataProvider = "LoginDetails")
	public void TestCase2(String Username, String Password) throws InterruptedException, IOException {
		SignIn NA = new SignIn(driver);
		NA.signIn().click();
		Thread.sleep(2000);
		NA.Email().sendKeys(Username);
		NA.Password().sendKeys(Password);
		Thread.sleep(2000);
		NA.ClickSignIn().click();
		Thread.sleep(2000);
		Log.info("Signed In");
	}

	@Test(priority = 3)
	public void TestCase3() throws IOException, InterruptedException {
		DataDriven d = new DataDriven();
		ArrayList<String> data = d.getData("search");
		SearchProduct sp = new SearchProduct(driver);
		sp.searchBox().sendKeys(data.get(1));
		Thread.sleep(2000);
		sp.searchBox().sendKeys(Keys.ENTER);
		Log.info("The product is typed in searched");
	}

	@Test(priority = 4)
	public void TestCase4() throws IOException {
//		DataDriven d = new DataDriven();
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		ArrayList<String> data = d.getData("Purchase");
		Product p = new Product(driver);
		WebElement Element = p.SelectProduct();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
		Log.info("The product is clicked");
	}

	@Test(priority = 5)
	public void TestCase5() throws InterruptedException {
		wishlist ws = new wishlist(driver);
		Thread.sleep(5000);
		ws.wishlisting().click();
		Log.info("Product has been Wishlisted");
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void TestCase6() throws InterruptedException {
		AddCart ac = new AddCart(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = ac.selectproduct();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(2000);
		Element.click();
		Log.info("Frequently bought item is selected");
		Thread.sleep(2000);
		ac.addCart().click();
		Thread.sleep(2000);
		Log.info("And added to cart");
		ac.closeCart().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 7)
	public void TestCase7() throws IOException, InterruptedException {
		DataDriven d = new DataDriven();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WriteAReview rev = new WriteAReview(driver);
		WebElement Element = rev.writeReview();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(2000);
		Element.click();
		Thread.sleep(2000);
		ArrayList<String> data1 = d.getData("Name");
		ArrayList<String> data2 = d.getData("Email");
		ArrayList<String> data3 = d.getData("Title");
		ArrayList<String> data4 = d.getData("Review");

		rev.name().sendKeys(data1.get(1));
		Thread.sleep(2000);
		rev.email().sendKeys(data2.get(1));
		Thread.sleep(2000);
		rev.stars().click();
		Thread.sleep(2000);
		rev.title().sendKeys(data3.get(1));
		Thread.sleep(2000);
		rev.review().sendKeys(data4.get(1));
		Thread.sleep(2000);
		WebElement Element1 = rev.submit();
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		Element1.click();
		Log.info("Review about product has been submitted");
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void TestCase8() throws InterruptedException {
		Cart c = new Cart(driver);
		c.GoToCart().click();
		Thread.sleep(2000);
		c.CheckOut().click();
		Thread.sleep(2000);
		c.closeNotif().click();
		Thread.sleep(5000);
		c.returnCart().click();
		if (c.getTitle().getText().contains("Shopping Cart")) {
			Assert.assertTrue(true);
			Log.info("Returned to the Cart");
		} else {
			Assert.assertTrue(true);
			Log.info("User is not came back to the Cart");
		}
	}

	@Test (priority = 9)
	public void TestCase9() throws InterruptedException {
		WishlistPage ws = new WishlistPage(driver);
			Thread.sleep(5000);
			ws.wishlist().click();
			Thread.sleep(2000);
			ws.getPopup().click();
			Thread.sleep(2000);

			if (ws.product().isDisplayed()) {
				Assert.assertTrue(true);
				Log.info("Product is present in WishList");
			} else {
				Assert.assertTrue(false);
				Log.info("Product is not present in the WishList");
			}
			Thread.sleep(5000);
		}


	@AfterTest
	public void closeDriver() {
		Log.info("Driver is closed");
		driver.close();
		driver = null;
	}
	
	@DataProvider
	public Object[][] LoginDetails() {
		Object[][] data = new Object[3][2];

		// FOR SIGN IN TESTING WITH EMPTY FIELD.
		data[0][0] = "";
		data[0][1] = "";

		// FOR SIGN IN TESTING WITH INVALID DATA.
		data[1][0] = "Simon@123";
		data[1][1] = "abcd";

		// FOR SIGN IN TESTING WITH VALID DATA.
		data[2][0] = "pevomek@mainctu.com";
		data[2][1] = "14785@23690";

		return data;
	}

}
