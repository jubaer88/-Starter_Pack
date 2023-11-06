package starter.mkt;



public class jo {

	public static void main(String[] args) {
	String a="hgfhj fghjgfk jds";
	int count=0;
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)!=' ') {
			count++;
		}
	}
	System.out.println("totall character is="+count);
	}

}
