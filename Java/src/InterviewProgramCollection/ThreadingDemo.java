package InterviewProgramCollection;


	
	class Book implements Runnable {  //we cant inherit by using extends //run 
		public void run () {
			for(int i=1;i<=5;i++) {
				System.out.println("updating Db");
				try {Thread.sleep(2000);} catch(InterruptedException e) {}
					
				}
			}
		}
	
	
 class Num extends Thread {
	 public void run() {
		 for(int i=1;i<=5;i++) {
			 System.out.println(i);
			 try {Thread.sleep(1000);} catch(InterruptedException e) {}
		 }
	 }
 }
		
 public class ThreadingDemo {
		public static void main(String[] args) throws InterruptedException {
			Runnable book=new Book();   //book object now becomes thread
			Num num=new Num();
				
			Thread t1=new Thread();
				//book.updateDb();
			   book.start();  //when starts given it goes to the book class and search for run method
				num.start();
				
				Thread t1=new Thread(book);
				t1.setName("book1");
				
				t1.start();
				if(book.isAlive()) {
					System.out.println("Still Executing");
				}
				
				
				
			book.join();
			num.join();  //join method makes bye output to println(last)
				
				
				System.out.println("bye");//bye displays first // thread 
		}
 }
 
 
