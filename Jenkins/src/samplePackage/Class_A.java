package samplePackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class_A {

//	@Test
//	@Parameters({"user","pwd"})
//	public void hello(String user, String pwd) {
//		
//		System.out.println("Hello ::: " + user + " password:::: " + pwd);
//		
//		System.out.println("Testing the changexffdhfh");
//	
//	}
	
	@Test(dataProvider="getData2")
	public void setData(String username, String password,String BankName)
	{
		System.out.println("you have provided username as::"+username);
		System.out.println("you have provided password as::"+password);
		System.out.println("you have provided BankName as::"+BankName);
	}
	
	
	
	@DataProvider
	public Object[][] getData1()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[3][3];

	// 1st row
	data[0][0] ="sampleuser1";
	data[0][1] = "abcdef";
	data[0][2] = "HDFC";
	// 2nd row
	data[1][0] ="sampleuser2";
	data[1][1] = "zxcvb";
	data[1][2] = "ICICI";
	// 3rd row
	data[2][0] ="sampleuser3";
	data[2][1] = "pass123";
	data[2][2] = "AXIS";
	return data;
	}
	
	@DataProvider
	public Object[][] getData2()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[3][3];

	// 1st row
	data[0][0] ="sampleuser4";
	data[0][1] = "abcdef";
	data[0][2] = "HDFC";
	// 2nd row
	data[1][0] ="sampleuser5";
	data[1][1] = "zxcvb";
	data[1][2] = "ICICI";
	// 3rd row
	data[2][0] ="sampleuser6";
	data[2][1] = "pass123";
	data[2][2] = "AXIS";
	return data;
	}

}
