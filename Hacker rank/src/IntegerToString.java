import java.util.Scanner;

public class IntegerToString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number between -100 to 100");
		int i= scan.nextInt();
		if(i>=-100&&i<=100){
		String s= Integer.toString(i);
		System.out.println(s);
		System.out.println("good job");
		}
		else {
			System.out.print("wrong answer");
		}
		
		

	}

}
