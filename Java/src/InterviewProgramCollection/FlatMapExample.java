package InterviewProgramCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(44);
		list.add(2);
		list.add(65);
		list.add(34);
		list.add(78);
		list.add(14);
		
		
		System.out.println("Before Sorting arraylist:");
		for(Integer i:list) {
			System.out.println(i);
		}
		Collections.sort(list);
			System.out.println("After Sorting arrayList");
			for(Integer j:list) {
				System.out.println(j);
			}
		}
		
		
		
		/*List<Integer> result=list.stream().flatMap(x->Stream.of(x,x*x)).collect(Collectors.toList());
		System.out.println(result);
		result.forEach(j->System.out.println(j)); */
				
	}


