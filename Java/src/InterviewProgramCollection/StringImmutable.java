  package InterviewProgramCollection;

public class StringImmutable {
	public static void main(String[] args) {
		String a="ABC";  //d
		String b=("TECH");
		
		a.concat(b);
		//System.out.println(a.concat(b));
		System.out.println(a);
		
		
		StringBuffer x=new StringBuffer("ABC");
		StringBuffer y=new StringBuffer("TECH");
		x.append(y);
		System.out.println(x);
		

		StringBuilder z=new StringBuilder("ABC");
		StringBuilder h=new StringBuilder("TECH");
		z.append(h);
		System.out.println(z);
	}

}
