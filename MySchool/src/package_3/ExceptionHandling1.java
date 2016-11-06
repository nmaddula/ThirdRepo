package package_3;

public class ExceptionHandling1 {

	public static String Reportstatus;
	
	public static void main(String[] args) {

		try {
			int a;
			int b;
			a=10;
			b=20;
			int result;
			result = b/a;
			System.out.println("print try ");
			Reportstatus = "PASS"
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("print catch");
		}
	}
	
	

}
