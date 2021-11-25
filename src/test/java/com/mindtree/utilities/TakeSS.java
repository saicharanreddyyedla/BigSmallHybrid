package com.mindtree.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusableComponents.Webdriver;

public class TakeSS {

	public void getScreenshot(String result) throws IOException {

		WebDriver driver = Webdriver.driver;

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(".\\Screenshots\\" + result + ".png"));
		System.out.print("ss taken");
	}

}
