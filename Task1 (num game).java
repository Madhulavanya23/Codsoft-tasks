import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random rand= new Random();
		int target=rand.nextInt(100)+1;
		int guess=0;
		System.out.println("enter your number range from 0 to 100:");
		for(int i=1;i<=5;i++)
		 {
		    System.out.println("attempt:" +i);
		   guess=sc.nextInt();
		   if(guess==target) 
		   {
		       System.out.println("congrats ur guess is correct");
		       break;
		   }
		       else if(guess<target) {
		           System.out.println("hey its low");
		   }
		   else
		    {
		       System.out.println("hey its high ");
		    }
		    
		       if(i==5)
		       {
		           System.out.println("hey its over the actual numbet was:" +target);
		       }
		  }     
		  sc.close();
	}	
	}
	
