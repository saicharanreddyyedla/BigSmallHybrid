package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.ProductUI;

public class Product {
	public Product(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver driver;
	
	public WebElement SelectProduct() {
		return driver.findElement(ProductUI.SelectProduct);
	}
}
