/* Favorite Day: Ask what your favorite day and returns your answer
 * Days: SUN, MON, TUE, WED, THU, FRI, SAT
 * After taking your input, outputs your favorite day
   */

package wot;

import java.util.Scanner;

public class Test {
enum Days { SUN, MON, TUE, WED, THU, FRI, SAT };
public static void main(String args[]){
Days a;
System.out.println("What's your favorite day? ");
Scanner keyboard = new Scanner(System.in);
a = Days.valueOf(keyboard.next());
System.out.println("Your favorite day is " + a);
}
}
/* Example: 
 * Inputs MON, Outputs: Mon
 * Inputs SUN, Outputs: SUN
 * */