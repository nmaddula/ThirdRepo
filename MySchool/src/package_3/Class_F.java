package package_3;

import package_2.*;

public class Class_F {

	public void method_14(){
		System.out.println("print method 14");
	}
	
	public void method_15(){
		System.out.println("print method 15 ");
	}
	
	public int Returntype(int a, int b, String abc) {
		
		int result = a*b;
		return result;
	}
	
	public static void main(String[] args) {
//methods calling type
Class_F obj_3 = new Class_F();

obj_3.method_14();
obj_3.method_15();

// static methods calling type
Class_D.method_10();

//package calling type
Class_C.method_5();

// returntype calling
Class_F obj_4 = new Class_F();
System.out.println("result is =" + obj_4.Returntype(8, 7 , "dhgd"));

	}

}
