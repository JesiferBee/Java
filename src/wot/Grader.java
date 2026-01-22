/* Grader:
 * Check to see your score then calculates your grade (A,B,C,D,F)
 * If the Score is above >=90,A >=80,B >=70,C >=60,D else,F
 * After calculating the score, Outputs your Grade 
   */

package wot;

import java.util.Scanner;

public class Grader
{
 public static void main (String []args)
 {
 int score;
 char grade;
 System.out.println ("Enter your score: ");
 Scanner keyboard = new
 Scanner (System.in);
 
 score = keyboard.nextInt ();

 if (score >= 90)
	 grade = 'A';
	 else if (score >= 80)
	 grade = 'B';
	 else if (score >= 70)
	 grade = 'C';
	 else if (score >= 60)
	 grade = 'D';
	 else
	 grade = 'F';
	 System.out.println (
	"Score = " + score);
	 System.out.println (
	 "Grade = " + grade);
 }
}
/* Example:
 * Score=60, OUTPUTS: D
 * Score=95, OUTPUTS: A
 * Score=50, OUTPUTS: F
 */
 * */