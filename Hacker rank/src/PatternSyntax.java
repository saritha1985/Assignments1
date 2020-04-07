import java.util.Scanner;
import java.util.regex.*;
public class PatternSyntax {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int testcases= scanner.nextInt();
		for(int i=1;i<=testcases;i++) 
		{
			String str=scanner.next();
			try{
				Pattern.compile(str);
			System.out.println("Valid");
			}
			catch(PatternSyntaxException e)
			{
		
System.out.println("Invalid");
		}

}}}
