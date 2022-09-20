package Day6;

public class TEST13 {
	
	public static void main(String[] args) {
		
		String name=args[0];
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		switch (name) {
		
		case "sub":System.out.println("subtration of two number:"+ (b-c));break;
		case "add":System.out.println("add of two number:"+ (b+c));break;
		case "multiply":System.out.println("multiply of two numbers:"+ (b*c));break;
		case "division":System.out.println("divison of two numbers:"+ (b/c));break;
		default:System.out.println("invalid result");break;
		}
		
	}

}
