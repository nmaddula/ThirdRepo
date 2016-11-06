package package_3;

public class ExceptionHandling {
	
	public static String ReportStatus;

	public static void main(String[] args) {
		

		try {

			int a;

			int b;

			a = 10;

			b = 20;

			int result;

			result = b / a;
			
			System.out.println("Priting from Try block after division");
			
			ReportStatus = "PASS";
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occurred");
			ReportStatus = "FAIL";
		}
		finally{
			
			System.out.println("Finall block..........Report status is: " + ReportStatus);
		}

		

	}

}
