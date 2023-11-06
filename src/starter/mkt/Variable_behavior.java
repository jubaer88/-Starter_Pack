package starter.mkt;

public class Variable_behavior {
	
	// non static fashion 
	  int a=30;
	  int b=40;
	  String name = "Mohammad Hosen";  
	 
	public void My1() {
		int c=a+b;
		System.out.println("name is "+name);
		System.out.println("age is "+c);
	
	
		
		
	}
	public void My2() {
		int c=a+b;
		System.out.println("name is "+name);
		System.out.println("age is "+c);
	
	
	}
	public static void main(String[] args) {
		//non static method call by creating referral name;
		Variable_behavior behavior= new Variable_behavior();
		//non static variable update ;
		behavior.a=20;// while we update vale ,its't take only update vale
		behavior.b=30;
		//method call by create object;
		behavior.My1();
		behavior.a=30;
		behavior.b=30;
		behavior.name="Hosen";
		behavior.My2();
	}

}



















