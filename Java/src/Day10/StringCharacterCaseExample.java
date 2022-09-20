package Day10;

public class StringCharacterCaseExample {

    public static void main(String[] args) {
		String movie = "BeASt";

		int noOfUppercase = 0;
		int noOfLowercase = 0;

		char[] movieArray = movie.toCharArray();
		char[] movieInUpperCaseArray = movie.toUpperCase().toCharArray();

		for(int i =0; i< movieArray.length; i++) {
		    if(movieArray[i] == movieInUpperCaseArray[i]) {
		        noOfUppercase++;
		    } else {
		        noOfLowercase++;
		    }w32232
		}

		System.out.println("Uppercase:" + noOfUppercase);
		System.out.println("Lowercase:" + noOfLowercase);
	}
}
