
package saritha;

import java.util.Scanner;

public class Weekday {;

	public static void main(String[] args) {
		System.out.print("Enter number of the Day: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println("enter number1: ");
		int number1 = scanner.nextInt();
		isWeekDay(number);
		nameOfTheDay(number1);
	}
	private static void isWeekDay(int number) {
		switch(number) {
		case 0:
			System.out.println("Weekend");
			break;
		case 1:
			System.out.println("Weekday");
			break;
		case 2:
			System.out.println("Weekday");
			break;
		case 3:
			System.out.println("Weekday");
			break;
		case 4:
			System.out.println("Weekday");
			break;
		case 5:
			System.out.println("Weekday");
			break;
		case 6:
			System.out.println("Weekend");
			break;
		}}
	private static void nameOfTheDay(int number1) {
		switch(number1) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesay");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		
		}
	}
	}
			
		
		

	


