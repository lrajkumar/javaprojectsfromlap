package Day10;

public class StringCharacterCaseExampleWithAscii {

	public static void main(String[] args) {
    		String movie = "BeASt";

    		int noOfUppercase = 0;
    		int noOfLowercase = 0;

    		char[] movieArray = movie.toCharArray();

    		for(int i =0; i< movieArray.length; i++) {
				int asciiValue = (int) movieArray[i];
                if(asciiValue < 97) {
                  noOfUppercase++;
                } else {
                    noOfLowercase++;
                }
    		}

    		System.out.println("Uppercase:" + noOfUppercase);
    		System.out.println("Lowercase:" + noOfLowercase);
    	}

}
