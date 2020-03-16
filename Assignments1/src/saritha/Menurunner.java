package saritha;

import java.util.Scanner;

public class Menurunner {

	public static void main(String[] args) {
		System.out.print("Enter number1: ");
		Scanner scanner =new Scanner(System.in);
		int number1 = scanner.nextInt();
		System.out.println("The number you entered is" +-number1);
		System.out.print("Enter number2:");
		
		int number2 = scanner.nextInt();
		System.out.println("The number you entered is"+-number2);
		System.out.println("Select your choice");

		System.out.println("1.Add");
		System.out.println("2.Substract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		
		int choice = scanner.nextInt();
		System.out.println("Your choice:"+-choice);
		
		if(choice ==1) {
		int a =  number1+number2;
		System.out.print(a);	
		}	
		else if(choice ==2)
		{
		int b = number1-number2;
		System.out.print(b);
		} 
		else if(choice ==3)
		{
			int c = number1*number2;
			System.out.print(c);
		}
		else {
			int d = number1/number2 ;
			System.out.print(d);
		}
			
		}
		
		

	}


