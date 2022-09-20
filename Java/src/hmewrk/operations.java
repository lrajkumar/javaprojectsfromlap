package hmewrk;

public class operations {
	public static void main(String[] args) {
		String a=args[0];
		if(a.charAt(0)=='N') {
			System.out.println("NORTH");
		}
		else if(a.charAt(0)=='S') {
			System.out.println("SOUTH");
		}
		else if(a.charAt(0)=='E') {
			System.out.println("EAST");
		}
		else if(a.charAt(0)=='W') {
			System.out.println("WEST");
		}
	
	}

}
