package InterviewProgramCollection;

import java.util.Comparator;

public class MethodReferenceNonStaticExample {
	public static void main(String[] args) {
		// Normal Method
		MethodReferenceNonStaticExample obj = new MethodReferenceNonStaticExample();
		int value = obj.compareNumbers(20, 10);
		System.out.println(value);

		
		
		// using Lamda Expression
		Comparator<Integer> compareNumbers = (x, y) -> obj.compareNumbers(x, y);
		System.out.println("comparator using lamda :" + compareNumbers.compare(20, 10));

		
		
		
		// Using Method Reference
		Comparator<Integer> compareNumbers1 = obj::compareNumbers;
		System.out.println("comparator using MethodReference :" + compareNumbers1.compare(20, 10));

	}

	public int compareNumbers(int x, int y) {
		return Integer.compare(x, y);
	}

}
