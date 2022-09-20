package InterviewProgramCollection;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;

public class MethodReferenceInJava {
	
	public static void main(String[] args) {
		
       BiFunction<Integer,Integer,Double> bifunctionalAdd =MethodReferenceInJava::addNumbers;
    System.out.println(bifunctionalAdd.apply(2,3));
    		   
	}
	
	public double addNumbers(int i,int j) {
		return i+j;
		
	}

}
