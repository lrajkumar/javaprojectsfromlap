package hmewrk;

public class average {
	public static void main(String[] args) {
		String a=args[0];
		String[] nums=a.split(",");
		int n1=Integer.parseInt(nums[0]);
		int n2=Integer.parseInt(nums[1]);
		int n3=Integer.parseInt(nums[2]);
		int n4=Integer.parseInt(nums[3]);
		int n5=Integer.parseInt(nums[4]);
		int[] result= {n1,n2,n3,n4,n5};
		int temp=0;
	
		for(int i=1;i<result.length;i++) {
			temp=temp+i;
			
		}
		
		System.out.println(temp);
		int average=0;
		average=temp/5;
		System.out.println(average);
		
		
	}

}
