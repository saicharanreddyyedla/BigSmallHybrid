package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.wishlistUI;

public class wishlist {
	public wishlist(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver driver;

	public WebElement wishlisting() {
		return driver.findElement(wishlistUI.wishlisting);
	}
}
