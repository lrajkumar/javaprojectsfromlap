package AfterInterviewFactoyMethod;

public class MobileFactory {
	 public static Mobile createMobile(String type) {
		if(type.equals(Mobile.IPHONE)) {
			return new Iphone(2,"A9","A9GPu");
		}
		else if(type.equals(Mobile.SONY)) {
			return new Sony(2,"ARM");
		}
		else if(type.equals(Mobile.SAMSUNG)) {
			return new Samsung(3, "Intel");
		}
		else {
			return null;
			
		}
	}

}
