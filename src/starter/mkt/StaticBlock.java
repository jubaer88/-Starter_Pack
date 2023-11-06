package starter.mkt;

public class StaticBlock {
	
	

	public static void main(String[] args) {
	
		System.out.println("I am method");
	}
	static {//SIB
		
		
		System.out.println("I am SIB");
	}
	
	
	
	
}
// how many SIB method have possible in class?
//answer is End number.
//sequential order way SIB will be execute what ever number of SIB in class then exc will be main method.
// SIB not be parameter.
//create class 5 SIB and execute.
// how to call IIB .instance initialization block.
// IIB only can by creating Object. 