package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.AddCartUI;

public class AddCart {
	public AddCart(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver driver;

	public WebElement selectproduct() {
		return driver.findElement(AddCartUI.selectProduct);
	}

	public WebElement addCart() {
		return driver.findElement(AddCartUI.addCart);
	}

	public WebElement closeCart() {
		return driver.findElement(AddCartUI.closeCart);
	}

}
