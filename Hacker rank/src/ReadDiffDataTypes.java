import java.util.Scanner;

public class ReadDiffDataTypes {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int number = scanner.nextInt();
	System.out.print("Enter a double value:");
	double db =scanner.nextDouble();
	System.out.println("Enter a string value:");
	String str = scanner.next();
	
	System.out.println("String:" +str);
	System.out.println("Double:" + db);
	System.out.println("int:" + number);
	

	}

}
