package InterviewProgramCollection;

import java.util.ArrayList;
import java.util.Comparator;

public class MethodReferenceComparator {
  public static void main(String[] args) {
	ArrayList<Integer> intList=new ArrayList<>();
	intList.add(3);
	intList.add(27);
	intList.add(12);
	intList.add(55);
	intList.add(69);
	intList.add(38);
	intList.sort(new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	
}
}
}

