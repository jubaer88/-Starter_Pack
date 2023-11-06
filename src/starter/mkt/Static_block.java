package starter.mkt;

public class Static_block {
	
	
	// Static Initialization block;
	static {
		System.out.println("i am static block");
	}
	
	static {
		System.out.println("i am static block2");
	}
	
	// Instance initialization block;
	
	{
		
		System.out.println("i am the instance block");
	}
	{
		System.out.println("i am the instance block2");
	}
	
	//Constructor 
 Static_block(){
		 
		 System.out.println("i am constractor");
	 }
 Static_block(int a){
		 
		 System.out.println("i am constractor2");
	 }
	
		// Main Method;
		  public static void main(String[] args) {
		  System.out.println("i am the Mian method");
		  
			
			  new Static_block ();
			  new Static_block(10);
			 
		  
		  
		  
		  
		  }
		 

}



