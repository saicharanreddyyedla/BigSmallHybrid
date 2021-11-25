package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.WriteAReviewUI;

public class WriteAReview {
	public WriteAReview (WebDriver driver) {
		this.driver=driver;
	}
	public WebDriver driver;
	public WebElement writeReview() {
		return driver.findElement(WriteAReviewUI.writeReview);
	}
	public WebElement name() {
		return driver.findElement(WriteAReviewUI.name);
	}
	public WebElement email() {
		return driver.findElement(WriteAReviewUI.email);
	}
	public WebElement stars() {
		return driver.findElement(WriteAReviewUI.stars);
	}
	public WebElement title() {
		return driver.findElement(WriteAReviewUI.title);
	}
	public WebElement review() {
		return driver.findElement(WriteAReviewUI.review);
	}
	public WebElement submit() {
		return driver.findElement(WriteAReviewUI.submit);
	}
}
