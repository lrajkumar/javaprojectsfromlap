package DAY12;

public class Difference {
	public int sub() {
		int a=20;
		int b=6;
		return a-b;
	}
	
	public int sub1(int a,int b) {
		return a-b;
	}
	public static void main(String[] args) {
	Difference d1=new Difference();
	System.out.println(d1.sub());
	System.out.println(d1.sub1(25,5));
	
	}
}
