package first.testng.example;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testngDemo {
	
	@BeforeMethod	
	
	public void beforemethod() {
		System.out.println("I'm before test");
		
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("I'm before all methods testNG test");
		
	}
	
	@Test	
	public void firsttestng() {
		System.out.println("I'm the first testNG test");
		
	}
	
	@Test	
	public void secondtestng() {
		System.out.println("I'm the second testNG test");
		
	}

	@AfterMethod	

	public void aftermethod() {
		System.out.println("I'm after test");
	
	}

	@BeforeTest
	public void aftertest() {
		System.out.println("I'm after all methods testNG test");
	
	}
}
