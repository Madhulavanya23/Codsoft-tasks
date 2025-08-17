import java.util.*;
class Main{
public static void gradeCaluculator (int n){
	if(n>=70 &&n<=100){
	    System.out.println("A");
	}
	else if(n>50&&n<70){
	    System.out.println("B");
	}
	else if(n>=35&&n<40){
	    System.out.println("c");
	}
	else{
	    System.out.println("fail");	
	}
}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("hey welcome");
	System.out.println("enter your  marks");
			int n=sc.nextInt();
			gradeCaluculator(n);
	}
}