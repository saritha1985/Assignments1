import java.util.Scanner;

public class StringFunction2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s =scanner.next();
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		String s1=s.substring(start,end);
		System.out.println("substring between given indices is"+" "+  s1);

	}

}
