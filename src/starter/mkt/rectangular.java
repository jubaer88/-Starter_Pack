package starter.mkt;

public class rectangular{




	static double areaOfSquer(double length )
	{
		double	result=length*length;
		return result;

	}

	static double areaOfRectangle(double length, double breadth )
	{
		double	result=length* breadth;
		return result;

	}
	static double areaOfTriangle(double base, double hight )
	{
		double	result=(base*hight)/2;
		return result;

	}
	static double areaOfCircle(double radius )
	{
		double pai =3.14;
		double area =pai*radius*radius;
		return area;

	}



	public static void main(String[] args) {

		double side=5.30;
		double length= 10.0;
		 
		double breadth=5.0;
		double base=4.0;
		double hight=13.0;
		double radius=15.0;

		System.out.println(areaOfSquer(length ) );
		System.out.println(areaOfRectangle(length, breadth ) );
		System.out.println(areaOfTriangle(base, hight ) );
		System.out.println(areaOfCircle( radius ));


	}

}