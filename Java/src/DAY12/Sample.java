package DAY12;

public class Sample {
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	public void add1(int a,int b) {
		System.out.println(a+b);
	}
	 public static void main(String[] args) {
		 Sample s=new Sample();
		 s.add();
		 s.add1(10,10);
		 
	 }

}
