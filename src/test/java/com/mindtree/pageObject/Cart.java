package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.CartUI;

public class Cart {
	public Cart(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver driver;

	public WebElement GoToCart() {
		return driver.findElement(CartUI.gotoCart);
	}

	public WebElement CheckOut() {
		return driver.findElement(CartUI.checkout);
	}

	public WebElement closeNotif() {
		return driver.findElement(CartUI.popup);
	}

	public WebElement returnCart() {
		return driver.findElement(CartUI.returnCart);
	}

	public WebElement getTitle() {
		return driver.findElement(CartUI.title);
	}
}
