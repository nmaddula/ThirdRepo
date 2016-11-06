package package_3;

public class Class_G {

	public int returntype(int a, int b){
		
		int result = a+b;
		return result;
	}
	
public int returntype1(int a, int b){
		
		int result = a*b;
		
		return result;
}

public int returntype11(int a, int b){
	
	int result = a-b;
	return result;
}

	
	public static void main(String[] args) {
		Class_G obj_G = new Class_G();
		
		System.out.println("result =" + obj_G.returntype(5, 8 ));
		System.out.println("result =" + obj_G.returntype1(5, 8 ));
		System.out.println("result =" + obj_G.returntype11(5, 8 ));

	}
	

}
