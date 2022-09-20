package DAY12;

public class UseArithmetic {

	    public static void main(String[] args) {
        Arthmetic object = new Arthmetic();

        System.out.println(object.findEligibility(15));
        System.out.println(object.findEligibility(19));


        int result = object.abc(10, 20);
        
        System.out.println(result);
        System.out.println(object.abc(10, 20));
        System.out.println(object.subtract(10, 20));

        System.out.println(object.factorial(5));
        System.out.println(object.factorial(4));
        System.out.println(object.factorial(10));
    }
}
