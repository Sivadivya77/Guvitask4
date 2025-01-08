package questions;

public class Fourthq {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
			System.out.println("BEFOR SWAP a value: " +a );

		System.out.println("BEFOR SWAP b value: " +b ); 
		 
		int temp = a;
		 a = b;
		 b = temp;
		
		 System.out.println("After swap: ");
		 System.out.println("a= " + a);
		 System.out.println("b= " +b);
		// TODO Auto-generated method stub

	}

}
//output
//BEFOR SWAP a value: 10
//BEFOR SWAP b value: 30
//After swap: 
//a= 30
//b= 10

