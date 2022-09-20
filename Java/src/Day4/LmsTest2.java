package Day4;

public class LmsTest2 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a+b;
		float d=Float.parseFloat(args[2]);
		float e=Float.parseFloat(args[3]);
		float f=d+e;
		long g=Long.parseLong(args[4]);
		long h=Long.parseLong(args[5]);
		long i=g+h;
		boolean j=Boolean.parseBoolean(args[6]);
		System.out.println(c);
		System.out.println(f);
		System.out.println(i);
		System.out.println(j);
	}

}
