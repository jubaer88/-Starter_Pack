package starter.mkt;
// instance initialization Block
public class IIB_withMinmethod {
	
	 IIB_withMinmethod(){
		 System.out.println("i am constractor1");
	 }
	 IIB_withMinmethod(int a){
		 System.out.println("i am constractor2");
	 }
	{
		System.out.println("I am IIB1");
	}
	{
		System.out.println("I am IIB2");
	}
	
	public static void main(String[] args) {
		//System.out.println("i am main method ");
		//new IIB_withMinmethod();//IIB
		System.out.println("i am main method ");
		new IIB_withMinmethod();//IIB
	
	}
static {//SIB  static initialization Block;
		
		
		System.out.println("I am SIB");
	}
}
// 