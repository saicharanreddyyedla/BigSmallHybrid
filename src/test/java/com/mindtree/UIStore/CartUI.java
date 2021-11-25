package com.mindtree.UIStore;

import org.openqa.selenium.By;

public class CartUI {
	public static By gotoCart = By.className("carticonimage");
	public static By checkout = By.xpath("//*[@name='checkout']");
	public static By popup = By.xpath("//*[@class='wa-optin-widget-close-img']");
	public static By returnCart = By.className("step__footer__previous-link-content");
	public static By title = By.xpath("//*[@class='grid__item medium-up--one-half small--one-half nopaddingleft']");
}
