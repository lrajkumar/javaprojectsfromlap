package hmewrk;

public class FactorialExample {
    
    public static void main(String[] args) {
		factorial(5);
		factorial(8);
		factorial(9);
	}
	
	private static void factorial(int number) {
	    int result = 1;
        for(int i = number; i > 0; i--) {
            result =  result * i;
        }
        System.out.println(result);
	}

}
