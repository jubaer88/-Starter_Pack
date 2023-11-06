package starter.mkt;
abstract class  MethodM1{
	abstract  void Addition();
	abstract  void devition();
	static void B() {
		System.out.println("super clasas static method");
	}
void A() {
		System.out.println("super class non-static method");
		
	}
	{
		System.out.println(" super class instance block");
	}
	static {
		System.out.println(" super class Static block");
	}
}
public class Child extends  MethodM1 {
 static void C() {
	System.out.println("I am child class static  Method");
}
	public static void main(String[] args) {

		Child c= new Child(); 
		c.Addition();
		c.devition();
		C();
		c.B();
		c.A();
	
		
	}

	@Override
	void Addition() {
		System.out.println("overriden addition");
		
	}

	@Override
	void devition() {
		System.out.println("overriden devition ");
		
	}

}
