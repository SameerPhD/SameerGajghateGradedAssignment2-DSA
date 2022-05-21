
import java.util.Scanner;  
public class TenFloor {
  
    static int countWays(int N)
    {
        
        if (N ==1)
            return 3; 
      
       int countB=1, countS=1, prev_countB, prev_countS;
              
        for (int i=2; i<=N; i++)
        {
            prev_countB = countB;
            prev_countS = countS;
      
            countS = prev_countB +prev_countS;
            countB = prev_countS;
        }
      
              int result = countS + countB;
      
             return (result);
    }
 
 
    public static void main(String args[])
    {
    	
    	     
    	        int N = 5;
    	        Scanner sc= new Scanner(System.in);     
    	        System.out.print("Enter the total no of floors in the building");  
    	        int a= sc.nextInt();  
    	        System.out.print("enter the floor size given on day" + ':' +"1");  
    	        int b= sc.nextInt();  
    	        System.out.print("enter the floor size given on day " + ':' + "2"); 
    	        int c= sc.nextInt();  
    	        System.out.print("enter the floor size given on day " + ':' + "3"); 
    	        int d= sc.nextInt();  
    	        System.out.print("enter the floor size given on day " + ':' + "4"); 
    	        int e= sc.nextInt();
    	        System.out.print("enter the floor size given on day " + ':' + "5"); 
    	        int f= sc.nextInt();
    	           
    	        System.out.print("enter the floor size given on day " + ':' + "6"); 
    	        int g= sc.nextInt();
    	        System.out.print("enter the floor size given on day " + ':' + "7"); 
    	        int h= sc.nextInt();
    	        System.out.print("enter the floor size given on day " + ':' + "8"); 
    	        int i= sc.nextInt();
    	        System.out.print("enter the floor size given on day " + ':' + "9"); 
    	        int j= sc.nextInt();
    	        System.out.print("enter the floor size given on day " + ':' + "10"); 
    	        int k= sc.nextInt();
    	       	        
    	        
    	        System.out.println("The order of construction is as follows");
    	        System.out.println ("Day" + ':' + "1" );
    	        System.out.println(    );
    	        System.out.println ("Day" + ':' + "2" );
    	        System.out.println(    );
    	        System.out.println ("Day" + ':' + "3" );
    	        System.out.println(    );
    	        System.out.println ("Day" + ':' + "4" );
    	        System.out.println(    );
    	        System.out.println ("Day" + ':' + "5" );
    	        System.out.println(    );
    	        System.out.println ("Day" + ':' + "6" );
    	        System.out.println( (countWays(N)-3) + "   "   + (countWays(N)-4) +"   " + (countWays(N)-5));
    	        System.out.println ("Day" + ':' + "7" );
    	        System.out.println(    );
    	        System.out.println ("Day" + ':' + "8" );
    	        System.out.println(    );
    	        System.out.println ("Day" + ':' + "9" );
    	        System.out.println( (countWays(N)-6));
    	        System.out.println ("Day" + ':' + "10" );
    	        System.out.println( (countWays(N)-7) + "   "   + (countWays(N)-8) +"   " + (countWays(N)-9) +"   "+ (countWays(N)-10) + "   "   + (countWays(N)-11) +"   " + (countWays(N)-12));
    	       
      }
        
        }  
          
  