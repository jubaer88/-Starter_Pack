package starter.pkg;

public class browser {
	
	public static void sleep(int sNum) {
		try {
			System.out.println("Waiting for: "+sNum+" sec.");
			Thread.sleep(sNum);
		} catch (Exception err) {
			System.out.println(err);
		}
	}
}
