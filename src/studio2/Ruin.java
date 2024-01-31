package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in= new Scanner(System.in);
			
			System.out.println("What is the start amount: ");
			int startAmount = in.nextInt();
			System.out.println("What is the win chance: ");
			double winChance = in.nextDouble();
			System.out.println("What is the win limit: ");
			int winLimit = in.nextInt();
			System.out.println("Total Simuations: ");
			int totalSimulations = in.nextInt();
			int simulationCount = 0;
			int currentAmount= startAmount;
			
			for(simulationCount=0; simulationCount <= totalSimulations; simulationCount++)
			{
				
				while (currentAmount > 0 && currentAmount < winLimit) 
				{
					
					if (Math.random() < winChance)
					{
						currentAmount++;
					}
					else
					{
						currentAmount--;
					}
					
				}
				System.out.println("Simulation " + simulationCount + ": " + currentAmount);
				
			}
				
			
	}
	
}
