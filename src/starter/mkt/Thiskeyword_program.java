package starter.mkt;




public class Thiskeyword_program {

	
	int age;
	String name;
	double salary;
	
	void emplye(int age, String name, double salary) {
		this.age=age;
		//this.name=name;
		this.salary=salary;
		System.out.println("my details");
	}
	public static void main(String[] args) {
		 Thiskeyword_program t1= new  Thiskeyword_program ();
		 t1. emplye(21, "ram", 0136146);
		 System.out.println(t1.age);
		 System.out.println(t1.name);
		 System.out.println(t1.salary);
		 Thiskeyword_program t2= new  Thiskeyword_program ();
		 t2. emplye(41, "md", 16466);
		 System.out.println(t2.age);
		 System.out.println(t2.name);
		 System.out.println(t2.salary);
	}

}