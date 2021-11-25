package com.mindtree.UIStore;

import org.openqa.selenium.By;

public class WishlistPageUI {
	public static By wishlist = By.linkText("wish list");
	public static By Popup = By.id("swym-welcome-button");
	public static By Assert = By.xpath("//h1[text()='My Wishlist']");
	public static By product = By.className("swym-link");
}
