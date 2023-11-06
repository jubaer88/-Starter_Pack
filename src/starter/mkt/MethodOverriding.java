package starter.mkt;

class ArithmaticOperator{
	
	
void add() {
	System.out.println("super class");
}

}


public class MethodOverriding extends ArithmaticOperator {

void add() {
	super.add();
System.out.println("sub class");

}
	public static void main(String[] args) {
		MethodOverriding m1= new  MethodOverriding();
		m1.add();
		

} 
	}