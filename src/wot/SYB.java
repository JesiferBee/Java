package wot;

class SYB {
 public int predictPopulation (int years)
 {
 int result = 0;
 double population = 0;
 double populationAmount = population;
 int count = years;
 while ((count > 0) && (populationAmount > 0))
 {
 int growthRate = 0;
 populationAmount = (populationAmount +
 (growthRate / 100) * populationAmount);
 count -- ;
 }
 if (populationAmount > 0)
 result = (int) populationAmount;
 return result;
 }
}