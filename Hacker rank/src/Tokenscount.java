import java.util.Scanner;

public class Tokenscount {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str = scanner.nextLine();
	scanner.close();
	String[] words=str.split(" ");
	for(int i=0;i<words.length;i++) {
		System.out.println(words[i]);
	}

		

	}

}
