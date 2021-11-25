package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.WishlistPageUI;

public class WishlistPage {
	public WishlistPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebDriver driver;
	public WebElement wishlist() {
		return driver.findElement(WishlistPageUI.wishlist);
	}
	public WebElement getPopup() {
		return driver.findElement(WishlistPageUI.Popup);
	}
	public WebElement AssertWishlist() {
		return driver.findElement(WishlistPageUI.Assert);
	}
	public WebElement product() {
		return driver.findElement(WishlistPageUI.product);
	}
}
