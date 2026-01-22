package wot;

import java.util.Scanner;

public class HourNoob {

	public static void main(String[] args) {
		int  sum = 0, next = 1000;
		
		 for ( ; next != 0;  ){
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter a number: ");
			next = keyboard.nextInt();

			sum = sum + next;
			System.out.println("The sum of the number is " + sum);
		}	
	}
}
