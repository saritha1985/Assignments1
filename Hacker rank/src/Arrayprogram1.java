import java.util.Scanner;

public class Arrayprogram1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int[] myArray=new int[n];
		for(int j=0;j<myArray.length;j++)
		{
			myArray[j]=scanner.nextInt();
			
		}
		for(int j=0;j<myArray.length;j++)
		{
		System.out.print(myArray[j]);
		}

	}

}
