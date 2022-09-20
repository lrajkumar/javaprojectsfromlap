


package DemoPackage;

import AfterInterview.OperatingSystemFactory;
import AfterInterview.Os;

public class FactoryMain {
	
		public static void main(String[] args) {
			OperatingSystemFactory osf=new OperatingSystemFactory();
			Os obj =osf.getInstance("");
			obj.spec();
		}
		
		
	}

	

