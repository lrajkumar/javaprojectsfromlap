package Day10;

public class StringLengthExample {

    public static void main(String[] args) {
		String[] movies = {"RRR", "Beast", "Valimai", "KGF"};

		for(int i = 0; i < movies.length; i++) {
            String movieName = movies[i];
            if(movieName.length() > 3) {
                System.out.println(movies[i]);
            }
		}
	}

}
