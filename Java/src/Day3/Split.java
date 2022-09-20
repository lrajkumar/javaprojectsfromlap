package Day3;

public class Split {
	public static void main(String[] args) {
		String name="hello world";
		String [] a=name.split(" ");
		System.out.println(a[0]);
		System.out.println(a[1]);
		String name1="Radha krishnan";
		String []b=name1.split("k");
		System.out.println(b[0]+b[1]);
		String name2="Rajaraman";
		String []c=name2.split("a");
		System.out.println(c[0]+c[1]+c[2]);
		String []d=name2.split("R");
		System.out.println(d[1]);
		
		
	}

}
