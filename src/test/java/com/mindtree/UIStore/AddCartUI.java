package com.mindtree.UIStore;

import org.openqa.selenium.By;

public class AddCartUI {
	public static By selectProduct = By.xpath("//*[@id='cbb-also-bought-box']/div/ul/li[3]/a/h3");
	public static By addCart = By.xpath("//*[@id=\"AddToCartForm-9318954759\"]/button");
	public static By closeCart = By.xpath("//*[@id=\'CartDrawer\']/form/div[1]/div[2]/button");
}
