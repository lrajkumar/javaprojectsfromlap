package DAY15;

public class Exam {
       public int marks(int maths, int physics) {
    	   return maths+physics;
    	   
       }
       public int marks(int maths,int physics,int english) {
    	   return maths+physics+english;
       }
       public static void main(String[] args) {
    	   Exam e=new Exam();
    	   System.out.println(e.marks(90,80));
    	   System.out.println(e.marks(80,75,60));
       }
}
