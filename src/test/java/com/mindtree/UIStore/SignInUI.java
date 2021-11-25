package com.mindtree.UIStore;

import org.openqa.selenium.By;

public class SignInUI {
	public static By signIn = By.cssSelector(".site-nav__link.site-nav__link--icon.signinlink");
	public static By Email =By.id("CustomerEmail");
	public static By Password = By.id("CustomerPassword");
	public static By SignInButton = By.cssSelector("input[type='submit']");
//	public static By CreateAccount = By.xpath("//*[@id='customer_register_link']");
//	public static By Firstname = By.id("FirstName");
//	public static By LastName = By.id("LastName");
//	public static By create = By.xpath("//*[@id='create_customer']/p/input");
}
