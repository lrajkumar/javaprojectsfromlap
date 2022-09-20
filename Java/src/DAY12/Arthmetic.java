package DAY12;

public class Arthmetic {

	int add(int num1, int num2) {
		return subtract(num1, num2) + num1 + num2;
	}

	String findEligibility(int age) {

		if(age > 18) {
		    return "Eligible";
		} else {
		    return "Not Eligible";
		}
	}
	
	int abc(int num1, int num2) {
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public int factorial(int num) {
		int result = 1;

		for (int i = num; i >= 1; i--) {
			result = result * i;
		}

		return result;
	}

	public int addFirstFiveNaturalNumbers() {
		return 1 + 2 + 3 + 4 + 5;
	}

}
