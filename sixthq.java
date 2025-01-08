package questions;

import java.util.Scanner;

public class sixthq {

	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner obj=new Scanner(System.in);
		int number = obj.nextInt();
		int fact =1;
		for (int i=1;i<=number;i++) {
			fact=fact*i;
		
			
		}
		System.out.println("Factorial of "+number +" is: " +fact);
		
    	  obj.close();


	}
	//output
	//Enter the number :
	//	4
	//	Factorial of 4 is: 24

}
