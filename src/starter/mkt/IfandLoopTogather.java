package starter.mkt;



public class IfandLoopTogather {

	int a=30;
	int b=10;

		public  void A() {
			
			int LoopCount=0;
	
	if(a>b) {	
		
		for(int i=b;i<a;i++) {
			System.out.println(i);
			LoopCount++;
		}
		System.out.println("total count:"+LoopCount);
	}else {
		
		System.out.println("not");
	}
	
}
		
		public static void main(String[] args) {
			 IfandLoopTogather Logic= new  IfandLoopTogather();
			Logic.A();
					
		}
}
