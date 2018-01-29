/*
 * VirtualPetApp:
 * a console application that will let a user interact with a VirtualPet.
 * 
 * Author: David Langford
 * Date  : Jan 26, 2018
 * 
 */

package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		VirtualPet mypet = new VirtualPet();

		printTitle();

		while (true) {
			printVitals(mypet);
			String userCommand = getUserCommand();
			doUserCommand(mypet, userCommand);
			tick(mypet);
		}
	}

	public static String getUserCommand() {
		String userCommand;
		boolean isValidCmd = false;
		do {
			printControls();

			System.out.print("Please type your command: ");

			userCommand = input.nextLine().trim().toLowerCase();
			System.out.println();
			switch (userCommand) {
			case "feed":
			case "water":
			case "walk":
			case "play":
			case "sleep":
				isValidCmd = true;
				break;
			case "quit":
				sayGoodbye();
			default:
				System.out.println("\nPlease use one of the supplied commands.");
			}
		} while (!isValidCmd);
		return userCommand;
	}

	public static void sayGoodbye() {
		System.out.println("\nGoodbye!\n");
		input.close();
		System.exit(0);
	}

	public static void tick(VirtualPet mypet) {
		mypet.setHunger(mypet.getHunger() + 5);
		mypet.setThirst(mypet.getThirst() + 5);
		mypet.setPoopy(mypet.getPoopy() + 5);
		if (mypet.getHunger() < 40 && mypet.getThirst() < 40 && mypet.getPoopy() < 40 && mypet.getSleepy() < 40) {
			mypet.setHappy(mypet.getHappy() + 5);
			mypet.setHealth(mypet.getHealth() + 5);
		} else {
			mypet.setHappy(mypet.getHappy() - 5);
			mypet.setHealth(mypet.getHealth() - 5);
		}
		if (mypet.getPoopy() > 40) {
			mypet.setHealth(mypet.getHealth() - 5);
			mypet.setHappy(mypet.getHappy() - 5);

		}
		if (mypet.getPoopy() > 80 || mypet.getHealth() < 40) {
			System.out.println("Ugh master? I don't feel so good.");
		} else {
			System.out.println("Hey there master! Whats next?");
		}

		System.out.println("Press <Enter> to continue.");
		input.nextLine();
		System.out.println("\n\n");
	}

	public static void doUserCommand(VirtualPet mypet, String userCommand) {
		switch (userCommand) {
		case "feed":
			System.out.println("You give " + mypet.getName() + " some yummy food.");
			mypet.feed();
			break;
		case "water":
			System.out.println("You let " + mypet.getName() + "drink clean refreshing water.");
			mypet.walk();
			break;
		case "walk":
			System.out.println("Long constituional walks are good for " + mypet.getName() + ".");
			mypet.walk();
			break;
		case "play":
			System.out.println(mypet.getName() + " loves to play with you!");
			mypet.play();
			break;
		case "sleep":
			System.out.println("After a long day, " + mypet.getName() + " is tired. Sleep is good.");
			mypet.feed();
			break;
		}
		System.out.println();
	}

	public static void printControls() {
		System.out.printf("%25s%n", "Pet Controls:");
		System.out.println("Feed) your pet.  Water) your pet.");
		System.out.println("Walk) your pet.  Play) with your pet.");
		System.out.println("Sleep) put your pet to bed.");
		System.out.println("QUIT) exit the control center.");
		System.out.println();
	}

	public static void printVitals(VirtualPet mypet) {
		System.out.println("Pets Vitals: " + mypet.getName() + " the " + mypet.getDescription());
		System.out.println("-----------------------------------------------");
		System.out.printf("%-10s %32s%n", "Hunger", makeBar(mypet.getHunger()));
		System.out.printf("%-10s %32s%n", "Thirst", makeBar(mypet.getThirst()));
		System.out.printf("%-10s %32s%n", "Sleepiness", makeBar(mypet.getSleepy()));
		System.out.printf("%-10s %32s%n", "Happiness", makeBar(mypet.getHappy()));
		System.out.printf("%-10s %32s%n", "Poopiness", makeBar(mypet.getPoopy()));
		System.out.printf("%-10s %32s%n", "Health", makeBar(mypet.getHealth()));
		System.out.println("------------------------------------------------");
		System.out.println();
	}

	public static void printTitle() {
		System.out.printf("%41s%n%n", "WCCI Pet Control Center 0.42");
	}

	public static String makeBar(int val) {
		int barSize = 30;
		int barFilledTo = (val * barSize) / 100;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < barSize; ++i) {
			if (i < barFilledTo) {
				sb.append("=");
			} else if (i == barFilledTo) {
				sb.append("|");
			} else {
				sb.append(" ");
			}
		}
		sb.append("] ");
		sb.append(String.format("% d", val));
		return sb.toString();

	}

}
