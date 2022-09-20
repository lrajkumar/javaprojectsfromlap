package Day10;

public class FindVowelsInStringWithFunction {

       static char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

      public static void main(String[] args) {

    		int vowelCount = 0;

    		String value = "AAAAAUOS";
    		char[] valueArr = value.toLowerCase().toCharArray();

    		for(int i = 0; i < valueArr.length; i++) {
    		    if(isVowel(valueArr[i])) {
    		        vowelCount++;
    		     }
    		}

    		System.out.println(vowelCount);
    	}

    private static boolean isVowel(char c) {
        for(int i = 0; i < vowels.length; i++) {
            if(vowels[i] == c) {
                return true;
            }
        }

        return false;
    }

}
