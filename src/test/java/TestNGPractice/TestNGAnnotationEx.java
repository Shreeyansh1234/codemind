package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationEx {
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}

	@BeforeTest
	public void beforeTestPlan() {
		System.out.println("Before test plan");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}

	@Test
	public void testCase() {
		System.out.println("Test case");
	}

	@Test
	public void testCase_2() {
		System.out.println("Test case 2");
	}

	@AfterClass
	public void AfterMethod() {
		System.out.println("After method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}

	@AfterTest
	public void afterTestPlan() {
		System.out.println("After test plan");
	}


}
