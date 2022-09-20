package InterviewProgramCollection;
//comparable and comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListStudent {
 public static void main(String[] args) {
	ArrayList<Student> alstu=new ArrayList<>();
	alstu.add(new Student(23,"Pune"));
	alstu.add(new Student(25,"chennai"));
	alstu.add(new Student(24,"coimbatore"));
	alstu.add(new Student(23,"Punjab"));
	alstu.add(new Student(26,"Nagarkoil"));
	alstu.add(new Student(23,"Jharkhand"));
	System.out.println(alstu);
	//Collections.sort((List<T>) alstu);
	
	
	
	
	
}
}
