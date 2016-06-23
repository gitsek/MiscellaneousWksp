package workoutPkg;

import java.util.Scanner;

public class IsOdd {
	
	public static boolean isOdd( int value ) {
		
		return ((value & 1) != 0);
	}
	
	public static void main(String[] args) {
		Scanner scanInput = new Scanner(System.in);
		int val = scanInput.nextInt();
		System.out.println("Is value " + val + " odd " + (isOdd(val)?"TRUE":"FALSE"));
		
		System.out.println("diff " + (2.0 - 1.10));
	}

}
