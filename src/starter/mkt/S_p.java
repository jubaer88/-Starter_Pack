package starter.mkt;
class h{
	
h(int a) {
		System.out.println("1st constractor");
	}
	
}
class Super_a extends h{
	
	Super_a(int a,int b){
		super(4);
		System.out.println("2nd const");
		//super(4);
	}
	
	
}
class Super_c extends Super_a{

	Super_c(int a, int b, int c){
		super(1, 2);
		System.out.println("3rd const");
		//super(1, 2);
	}
	
}
public class S_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Super_c(1, 0, 0);
		
	}

}
