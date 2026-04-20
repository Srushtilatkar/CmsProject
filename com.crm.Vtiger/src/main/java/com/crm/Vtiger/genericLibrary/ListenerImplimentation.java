package com.crm.Vtiger.genericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListenerImplimentation extends BaseClass implements ITestListener{
	
		ExtentReports report;
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getName();
		report.createTest(name);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		JavaUtility j = new JavaUtility();
		String dateAndTime = j.getDateAndTime("dd-MM-yyyy hh-mm-ss");
		TakesScreenshot t = (TakesScreenshot)driver;
	    File src = t.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./Screenshot/"+name+dateAndTime+".png");
	    try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./ExtentReport/report.html");
		reporter.config().setDocumentTitle("Automation");
		reporter.config().setReportName("Execution Details");
		reporter.config().setTheme(Theme.STANDARD);
		
		report.attachReporter(reporter);
		report = new ExtentReports();
		report.setSystemInfo("url", "http://localhost:8888");
		report.setSystemInfo("os", "windows");
		report.setSystemInfo("Browser", "chrome");
		report.setSystemInfo("test enginner", "srushti");
		
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

	
}
