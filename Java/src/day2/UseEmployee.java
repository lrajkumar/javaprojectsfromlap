package day2;

public class UseEmployee {
	public static void main(String[] args) {
		Employee details1=new Employee();
		details1.employeeName="raj";
		details1.employeeId=4001;
		details1.dateOfBirth=1996;
		details1.mobileNo=9003042298l;
		System.out.println("Employee Name:" +details1.employeeName);
		System.out.println("Employee Id:" +details1.employeeId);
		System.out.println("date of birth:"+details1.dateOfBirth);
		System.out.println("mobile no:"+"+91" +" " +details1.mobileNo);
		Employee details2=new Employee();
		details2.employeeName="kumar";
		details2.employeeId=4015;
		details2.dateOfBirth=1997;
		details2.mobileNo=9003042297l;
		System.out.println("Employee Name:" +details2.employeeName);
		System.out.println("Employee Id:" +details2.employeeId);
		System.out.println("date of birth:"+details2.dateOfBirth);
		System.out.println("mobile no:"+"+91" +" " +details2.mobileNo);
		
		
		
	}
	
	

}
