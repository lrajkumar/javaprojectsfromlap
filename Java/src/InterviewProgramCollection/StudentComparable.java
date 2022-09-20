package InterviewProgramCollection;

import java.util.Comparator;

public class StudentComparable implements Comparable<StudentComparable> {
	int age;
	String loc;

	public StudentComparable(int age, String loc) {
		this.age = age;
		this.loc = loc;

	}

	@Override
	public String toString() {
		return "StudentComparable [age=" + age + ", loc=" + loc + "]";
	}

	@Override
	public int compareTo(StudentComparable o) {
		// TODO Auto-generated method stub
		if (age == o.age) {
			return 0;
		} else if (age > o.age) {
			return 1;
		}
		return -1;
	}
	

}
