import java.util.Scanner;
public class Beer {

	public static void main(String[] args) {
		Scanner scanantha = new Scanner(System.in); 
		
		double beers = 0;
		double beerPrice = 0;
		double beerAnnually = 0;
		double calories = 0;
		double pounds = 0;
		double cost = 0;
		double poundsPerDay = ((double)15/365);
				
		System.out.println("How many beers do you drink per day?");
		beers = scanantha.nextDouble();
		System.out.println("How much do you spend on a single beer?");
		beerPrice = scanantha.nextDouble();
		
		beerAnnually = beers * 365;
		calories = beerAnnually * 150;
		pounds = poundsPerDay * beerAnnually;
		cost = beerPrice * beerAnnually;
		System.out.println(poundsPerDay);
		System.out.println("That is approximately " + beerAnnually + " beers in one year."
		+ "\n" + "In one year, you will consume approximately " + calories + " from beer alone."
		+ "\n" + "Without diet or exercise to counter these calories, "
		+ "\n" + "you can expect to gain " + pounds + " pounds from drinking that much beer this year."
		+ "\n" + "You can expect to be $" + cost + " poorer as a result of drinking that much beer this year.");

	}//end main.

}//end Beer.
