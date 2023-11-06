package starter.mkt;
class Teacher{
	Teacher(){
		System.out.println("Teacher constractor");
	}
	
}
class Mentor extends Teacher {
	Mentor(int a){
		System.out.println("Mentor constractorPSCS");
	}
	Mentor(){
		System.out.println("Mentor constractor");
	}
	
}
public class Student extends Mentor
{
	public Student(String s) {
		System.out.println("child constractor PSCS");
	}
	public Student() {
		System.out.println("child constractor");
	}
	
	public static void main(String[] args) {
		new Student();
	}
}
