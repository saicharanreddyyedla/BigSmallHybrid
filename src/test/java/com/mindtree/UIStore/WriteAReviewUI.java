package com.mindtree.UIStore;

import org.openqa.selenium.By;

public class WriteAReviewUI {
	public static By writeReview = By.xpath("//*[@id=\'judgeme_product_reviews\']/div/div[1]/div[3]/a[1]");
	public static By name = By.name("reviewer_name");
	public static By email = By.name("reviewer_email");
	public static By stars = By.xpath("//a[@title='3 stars']");
	public static By title = By.name("review_title");
	public static By review = By.name("review_body");
	public static By submit = By.xpath("//*[@id=\'judgeme_product_reviews\']/div/div[1]/div[7]/form/input");
}
