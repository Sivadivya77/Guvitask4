package questions;

public class Tenthq {

	public static void main(String[] args) {
		int count = 0, num = 000123456;

	    while (num > 0) {
	     
	      num =num/ 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	}

}
//output 
//Number of digits: 5
