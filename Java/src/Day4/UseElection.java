package Day4;

public class UseElection {
          public static void main(String[] args) {
        	 Election e1=new Election();
        	 Election e2=new Election();
        	 Election e3=new Election();
        	 
        	 
        	 
        	String a=args[0];
        	String[] b=a.split(",");
        	
        	 e1.candidateName=b[0];
             e1.votes=Integer.parseInt(b[1]);
             e1.isWinner=Boolean.parseBoolean(b[2]);
             e1.percentageOfVote=Float.parseFloat(b[3]);
             
             String f=args[1];
             String[] c=f.split(",");
             
             e2.candidateName=c[0];
             e2.votes=Integer.parseInt(c[1]);
             e2.isWinner=Boolean.parseBoolean(c[2]);
             e2.percentageOfVote=Float.parseFloat(c[3]);
             
             String g=args[2];
             String[] d=g.split(",");
             
             e3.candidateName=d[0];
             e3.votes=Integer.parseInt(d[1]);
             e3.isWinner=Boolean.parseBoolean(d[2]);
             e3.percentageOfVote=Float.parseFloat(d[3]);
             
                     
           
            System.out.println(e1.candidateName);
            System.out.println(e1.votes);
            System.out.println(e1.isWinner);
            System.out.println(e1.percentageOfVote);
            
            System.out.println(e2.candidateName);
            System.out.println(e2.votes);
            System.out.println(e2.isWinner);
            System.out.println(e2.percentageOfVote);
            
            
           System.out.println(e3.candidateName);
           System.out.println(e3.votes);
           System.out.println(e3.isWinner);
           System.out.println(e3.percentageOfVote);
           
           String candidate1UpperCase=(e1.candidateName).toUpperCase();
           String candidate2UpperCase=(e2.candidateName).toUpperCase();
           String candidate3UpperCase=(e3.candidateName).toUpperCase();
           
           
          System.out.println(e1.votes+e2.votes+e3.votes);
          System.out.println(candidate1UpperCase);
          System.out.println(candidate2UpperCase);
          System.out.println(candidate3UpperCase);
            
             	 
          }
}

class Election {
	         int votes;
	          String candidateName;
	          boolean isWinner;
	          float percentageOfVote;
	          
	           
}
