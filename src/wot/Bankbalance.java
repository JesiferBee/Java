/* Bank Balance Calculator:
 * Check your account balance either you have Money in your account, or you borrowed money
 * If the balance is positive: Gives 2% interest rating every year
 * If the balance is negative: Deduct the balance with the interest rate 8% every month
 * After calculating, outputs the result of the calculation after 1 month
   */

package wot;

import java.util.Scanner;

public class Bankbalance
{
 public static final double OVERDRAWN_PENALTY = 8.00;
 public static final double INTEREST_RATE = 0.02; // 2% annually
 public static void main (String [] args)
 {
 double balance;
 System.out.print ("Enter your checking account balance: $");
 Scanner keyboard = new Scanner (System.in);
 balance = keyboard.nextDouble ();
 System.out.println ("Original balance $" + balance);
 if (balance >= 0)
 balance = balance + (INTEREST_RATE * balance) / 12;
 else
 balance = balance - OVERDRAWN_PENALTY;
 System.out.print ("After adjusting for one month ");
 System.out.println ("of interest and penalties,");
 System.out.println ("your new balance is $" + balance);
 }
}

/* Case 1: Account balance = 100 (positive), OUTPUTS: 100 + 0.1666~ = 100.1666~
 * Case 2: Account balance = -100 (negative), OUTPUTS: -100 + (-8) = -108
 * */
