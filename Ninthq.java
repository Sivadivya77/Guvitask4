package questions;

import java.util.Scanner;

public class Ninthq {

	public static void main(String[] args) {
		
		Scanner my=new Scanner (System.in);
		
		System.out.println("Enter the Age: ");
		int age = my. nextInt( );
		if ( age>60 )
		{
			System.out.println("I'm senior citizen");
			
		}
		else {
			System.out.println("I'm not senior citizen");
		}
		my.close();
}
	}

//output
//Enter the Age: 
//55
//I'm not senior citizen


