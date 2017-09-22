package first.testng.example;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.internal.junit.*;

public class secondDemo {
	
	@Test(dependsOnMethods=("secondtestng"), alwaysRun=true)		
	public void firsttestng() {
		System.out.println("first testNG test");
	}
	
	@Test(timeOut=100)	
	public void secondtestng() {
		System.out.println("second testNG test");
	}
	
	@Test(enabled=false)	
	public void thirdtestng() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		System.out.println("third testNG test");
	}
}
