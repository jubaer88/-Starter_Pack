 


package starter.mkt;

//this_calling statement used for call Constructor/..

public class thiscalling {
	thiscalling(int a){
		this(1, 2);
		System.out.println("first const");
		//this(1, 2);
	}
	
	thiscalling(int a, int b){
		this(1, 2, 3);
		System.out.println("second const");
	}
	thiscalling(int a,int b,int c){

		System.out.println("3rd const");
	}
	public static void main(String[] args) {
	new thiscalling(1);

	}

}

