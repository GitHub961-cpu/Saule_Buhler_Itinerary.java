/**
 * This program asks user to enter several destinations 
 * then prints them in order from one destination to another to so on. 
 * @author Saule Buhler
 * @version 1.0
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.StringBuilder;
public class Saule_Buhler_Itinerary 
{
	public static void main(String[] args)
	{
		//instantiate scanner, arraylist and stringbuilder
		Scanner input = new Scanner(System.in);
		ArrayList<String> destination = new ArrayList<String>();
		StringBuilder sb = new StringBuilder("");
		
		sb.append(" to");//adding "to" between the destinations 
		
		//display on the screen
		System.out.printf("This program will prompt you for a series of destinations.\n" + 
				"Then it will display your travel route based on your entries\n\n");
		System.out.printf("Please enter your destinations [Enter done to finish]: \n");
		System.out.print("Destination: ");
		
		//user entry
		String userEntry = input.nextLine();
		
		//storing each user entry to destination arraylist
		destination.add(userEntry);
		
		/**
		 * until user enters "done" keep storing each entry in destination list
		 */
		while(!userEntry.equalsIgnoreCase("done"))
		{
			System.out.print("Destination: ");
			userEntry = input.nextLine();
			destination.add(userEntry);
		}
		System.out.print("Itinerary: ");
		
		/**
		 * when user finally enters "done" remove the word from destination list,
		 * so it wouldn't show up as one of the destinations
		 */
		if(userEntry.equalsIgnoreCase("done"))
		{
			destination.remove(userEntry);
		}
		input.close();
		
		/**
		 * replace each character in each place in destination list to upper case
		 * and add "to" in between
		 */
		for(String place: destination) 
		{
			System.out.print(" " + place.toUpperCase() + sb);
		}
		/**
		 * I could not figure out how to get rid of "to" at the end. 
		 * I tried to use this sb.replace(1, 3, " ");
		 */
		
	}
}
