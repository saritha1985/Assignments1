import java.util.Scanner;

public class PrintMultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number:");
		int number =scanner.nextInt();
		for(int i=1;i<=10;i++)
		{
			
			System.out.printf("%d x%d  = %d",number,i,number*i).println();
			
		}


	}

}
