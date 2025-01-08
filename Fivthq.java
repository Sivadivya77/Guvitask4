package questions;

import java.util.Scanner;

public class Fivthq {

	public static void main(String[] args) {
		
		int number;
		int no= 0;
		System.out.println("Enter the number ;");
		Scanner obj = new Scanner(System.in);
		number = obj.nextInt();
		
		if (number==0||number==1) {
			System.out.println(number +"is not prime number");
		}
		else {
			int middleno = number/2;
			for (int i=2;i<=middleno;i++) {
				if (number % i ==0)
				{
					System.out.println( number + " is not prime number");
					no =1;
					break;
					}
			}
			if (no==0) {
				System.out.println(number +"is a prime number");
			}
		}
		obj.close();

	}

}
//output                        
//Enter the number ;               
//76
//76 is not prime number
//output
//Enter the number ;
//7
//7 is a prime number
