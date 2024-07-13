package TestNGPractice;

import org.testng.annotations.Test;

public class PriorityOfTestCasesEx {
	@Test(priority = 3)
	public void a() {
		System.out.println("Test case a");
	}

	@Test(priority = -3)
	public void z() {
		System.out.println("Test case z");
	}

	@Test(priority = 3)
	public void c() {
		System.out.println("Test case c");
	}


}
