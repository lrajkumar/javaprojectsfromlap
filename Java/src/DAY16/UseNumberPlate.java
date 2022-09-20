package DAY16;

public class UseNumberPlate {
	public static void main(String[] args) {
		TNGovernment t=new TNGovernment();
		KeralaGovernment k=new KeralaGovernment();
		
		t.numberPlateId();
		t.numberPlateColor();
		t.numberPlateFont();
		t.joiningType();
		
		k.numberPlateId();
		k.numberPlateColor();
		k.numberPlateFont();
		k.joiningType();
		k.material();
	}

}
