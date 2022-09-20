package Day10;

public class FindVowelsInStringExample {

    public static void main(String[] args) {

		int vowelCount = 0;

		String value = "AAAAAUOS";
		char[] valueArr = value.toLowerCase().toCharArray();

		for(int i = 0; i < valueArr.length; i++) {
		    if(valueArr[i] == 'a'
		     || valueArr[i] == 'e'
		     || valueArr[i] == 'i'
		     || valueArr[i] == 'o'
		     || valueArr[i] == 'u') {
		        vowelCount++;
		     }
		}

		System.out.println(vowelCount);
	}

}
