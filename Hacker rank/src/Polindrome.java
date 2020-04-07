import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str,rev="";
		str = scanner.nextLine();
		scanner.close();
		int length = str.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev)) 
			System.out.println(str+"is a Polindrome");
		else
				System.out.println(str+ " "+"is not a Polindrome");
		}

	}


