package InterviewProgramCollection;

public class Singleton {
	public static void main() {
		{
			Abc obj1 = Abc.getInstance();
			Car.getInstance();
			Car.getInstance();
			// nAbc obj2=Abc.getInstance();
		}
	}

}

class Abc {   //Eager initialization 
	private static Abc obj = new Abc();   //static object;

	private Abc() { // private Constructor 

	}

	public static Abc getInstance() { // Static method
		return obj;
	}
}

class Car{   //Lazy initialization 
	private static Car obj = null;

	private Car() {                   //private Constructor

	}

	public synchronized static Car getInstance() {
		if(obj == null) {
			obj = new Car();
		}
		
		return obj;
	}
}