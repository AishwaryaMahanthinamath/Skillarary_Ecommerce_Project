package TestNg;

import org.testng.annotations.Test;

public class Priority {
    //in testng we can give multiple main method 
	//1st Test Scripts
	//priority we will which test script need to execute first low number executes first so -5 
    //invocationcount we will use to tell how many times that test script need to execute/repate
	//enabled=false we will give not execute , enabled=true we will give to execute
	
	@Test(priority=0,invocationCount=2)
	public void demo() {
		System.out.println("Hi Demo1");
	}
	//2nd Test Scripts
	@Test(priority=-2,invocationCount=-1)
	public void demo1() {
		System.out.println("Hi Demo2");
	}
	//3nd Test Scripts we can give n no main method
	@Test(priority=-5,invocationCount=2,enabled=false)
	public void demo2() {
		System.out.println("Hi Demo3");
	}
}


