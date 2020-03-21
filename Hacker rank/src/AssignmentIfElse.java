import java.util.Scanner;

public class AssignmentIfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
	
		if(number %2 != 0)
		{
		
			System.out.print("Weird");
			
		}
		else if(number %2 ==0 ) {
			 
			if(number>=2 &&number<=5) {
		
			System.out.print("not weird");
			
		}
			else if(number>=6 && number<=20)
			{
			System.out.print("Weird");
			}
		else if (number > 20){
			System.out.println("Not Wierd");
		}
		
		 }
	}}
