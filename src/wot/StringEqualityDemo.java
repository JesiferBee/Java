/* String Equality Demo:
 * 
 * Comparing 2 strings to see if they are the same or different whilst ignoring capitalization
 * Use "equals" instead of "==" for strings
 * Enter 2 lines
 * The code then compares the 2 lines to see if they are equal
   */

package wot;

import java.util.Scanner;

public class StringEqualityDemo
{
 public static void main (String [] args)
 {
 String s1, s2;
 System.out.println ("Enter two lines of text:");
 Scanner keyboard = new Scanner (System.in);
 s1 = keyboard.nextLine ();
 s2 = keyboard.nextLine ();
 if (s1.equals (s2))
 System.out.println ("The two lines are equal.");
 else
 System.out.println ("The two lines are not equal.");
 if (s2.equals (s1))
 System.out.println ("The two lines are equal.");
 else
 System.out.println ("The two lines are not equal.");
 if (s1.equalsIgnoreCase (s2))
 System.out.println (
 "But the lines are equal, ignoring case.");
 else
 System.out.println (
 "Lines are not equal, even ignoring case.");
 }
}

/* Case 1: When 2 lines are the same (Ex: "Where winds meet" and "Where winds meet"), OUTPUTS: "The two lines are equal." "But the lines are equal, ignoring case."
 * Case 2: When 2 lines are the same but different capitalization (Ex: "Where winds meet" and "WHERE WINDS MEET"), OUTPUTS: "The two lines are equal." "But the lines are not equal, ignoring case."
 * Case 3: When 2 lines are different (Ex: "Where winds meet" and "Where winds leave"), OUTPUTS: "The two lines are not equal." "Lines are not equal, even ignoring case."
*/