import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String A = scanner.next();
String B= scanner.next();
int  l =A.length()+B.length();
System.out.println("lentgh of the strings together:" +l);
String S1= A.substring(0, 1).toUpperCase();
String A1 = S1 + A.substring(1);
String S2= B.substring(0, 1).toUpperCase();
String B1 = S2 + B.substring(1);
System.out.println("Combined String:"+ A1+" "+B1);

	if(A.compareTo(B)<0) {
		System.out.println("Yes,Bis lexicographically larger than A");
	}else {
		System.out.println("No");
		
	}
}






	}


