package package_1;

public class Class_B {

	public void nonReturnType() {

		System.out.println("This is method 3 from Class_B");

	}

	public int ReturnType() {

		int a = 10, b = 20;

		int result = a + b;

		return result;
	}

	public void method_4() {

		System.out.println("This is method 4 from Class_B");

	}

	public static void main(String[] args) {

		Class_B obj_1 = new Class_B();
		obj_1.nonReturnType();
		obj_1.method_4();

		Class_B myObj = new Class_B();
		System.out.println("result is: " + myObj.ReturnType());

	}

}
