package first.testng.example;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.internal.junit.*;


public class GroupTest {	
	@Test(groups= {"group1"})		
	public void firstGroup() {
		System.out.println("this is group1");
	}
	
	@Test(groups= {"group2"})	
	public void secondGroup() {
		System.out.println("this is group2");
	}
	
}