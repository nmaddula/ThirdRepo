package samplePackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class_A {

	@Test
	@Parameters({"user","pwd"})
	public void hello(String user, String pwd) {
		
		System.out.println("Hello ::: " + user + " password:::: " + pwd);
		
		System.out.println("I made the change");
		
	}

}
