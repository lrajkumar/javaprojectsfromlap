package DAY19CollectionsIIIStreams;

public class Gym {
           private String gymName;
           private int gymFee;
           private float gymRating;
		public String getGymName() {
			return gymName;
		}
		public void setGymName(String gymName) {
			this.gymName = gymName;
		}
		public int getGymFee() {
			return gymFee;
		}
		public void setGymFee(int gymFee) {
			this.gymFee = gymFee;
		}
		public float getGymRating() {
			return gymRating;
		}
		public void setGymRating(float gymRating) {
			this.gymRating = gymRating;
		}
		public Gym(String gymName, int gymFee, float gymRating) {
			super();
			this.gymName = gymName;
			this.gymFee = gymFee;
			this.gymRating = gymRating;
		}
           
}
