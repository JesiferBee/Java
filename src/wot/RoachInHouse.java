/*
 * Calculate the population of cockroaches in a house until the max volume has been reached
 * */

package wot;

import java.util.Scanner;
public class RoachInHouse
{
 private static final double ONE_BUG_VOLUME = 0.002;
 private static final double GROWTH_RATE = 0.95;

 public static void main (String [] args)
 {
 int startPopulation, countWeeks;
 double houseVolume, totalBugVolume, newBugVolume, newBugs, population;
 
 Scanner keyboard = new Scanner(System.in);
 
 System.out.println("Enter the total volume of your house in cubic feet: ");
 houseVolume = keyboard.nextDouble();

 System.out.println("Enter the estimated number of roaches in your house: ");
 startPopulation = keyboard.nextInt();

 population = startPopulation;
 
 totalBugVolume = population * ONE_BUG_VOLUME;
 
 countWeeks = 0;
 
 while (totalBugVolume < houseVolume) {
 newBugs = population * GROWTH_RATE;
 newBugVolume = newBugs * ONE_BUG_VOLUME;
 population = population + newBugs;
 totalBugVolume = totalBugVolume + newBugVolume;
 countWeeks = countWeeks + 1;
 };
		 
 System.out.println("Starting with a roach population of " + startPopulation + " and a house with a volume of " + houseVolume + " cubic feet, after " + countWeeks + 
" weeks, the house will be filled with " + (int)population + " roaches.");
 System.out.println("They will fill a volume of " + (int)totalBugVolume + " cubic feet.");
 System.out.println("Better call Debugging Experts Inc.");

 }
}