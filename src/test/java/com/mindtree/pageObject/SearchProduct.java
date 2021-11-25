package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.SearchProductUI;

public class SearchProduct {
	public SearchProduct(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver driver;

	public WebElement searchBox() {
		return driver.findElement(SearchProductUI.searchBox);
	}
}
