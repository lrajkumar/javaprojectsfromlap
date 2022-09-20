package InterviewProgramCollection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
      //Queue<Integer> i=new LinkedList<>();  //fifo;
PriorityQueue<Integer> i1=new PriorityQueue<>();  // it sorts in ascending order but adds 3 first and removes according in first order
		i1.add(15);
		i1.add(20);
		i1.add(14);
		i1.add(16);
		
		System.out.println(i1);

        /*System.out.println(i.peek());  //peek shows the first value
		System.out.println(i.remove());  //remove is same as pool - when list is null remove shows error but poll shows null in output
		System.out.println(i.peek());
		System.out.println(i.remove());
		System.out.println(i.peek());
		System.out.println(i.poll());*/
		
	}
}
