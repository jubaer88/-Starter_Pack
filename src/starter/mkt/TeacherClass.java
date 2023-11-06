package starter.mkt;
// supercalling statement means call super class constractor from child class.
class M{
	
	M(int s, double b){
		System.out.println("m class");
	}
	
}
class S extends M{
	
	 S(int a){
		 super(10,9.8);
		 System.out.println("S");
	 }
}
public class TeacherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new S(0);
	}

}
