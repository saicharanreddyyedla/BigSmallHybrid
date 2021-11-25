package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.SignInUI;

public class SignIn {

	public SignIn(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver driver;

	public WebElement signIn() {
		return driver.findElement(SignInUI.signIn);
	}

	public WebElement ClickSignIn() {
		return driver.findElement(SignInUI.SignInButton);
	}

	public WebElement Email() {
		return driver.findElement(SignInUI.Email);
	}

	public WebElement Password() {
		return driver.findElement(SignInUI.Password);
	}

}
