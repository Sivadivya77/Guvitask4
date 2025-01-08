package questions;

import java.util.Scanner;

public class Secoudq {

	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in); 
		System.out.println("Enter the ODD or EVEN number: ");
		int number = myobj.nextInt();
		
		if (number % 2==0) {
			System.out.println("Its an EVEN number: " + number);
		
		}
		else {
			System.out.println("Its an ODD number: " + number);
		}
	 myobj.close();
	}
}
	//output
//Enter the ODD or EVEN number: 
//12
//Its an EVEN number: 12

	


