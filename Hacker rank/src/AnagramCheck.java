import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

public static void main(String[] args) {
		String str1,str2,str3,str4;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter String1: ");
str1 = scanner.nextLine();
System.out.println("Enter String2: ");
str2 =scanner.nextLine();  
scanner.close();
str3=str1.toLowerCase();
str4=str2.toLowerCase();
boolean isAnagram;
char[] str1char=str3.toCharArray();
char[] str2char=str4.toCharArray();
Arrays.sort(str1char);
Arrays.sort(str2char);
isAnagram=Arrays.equals(str1char, str2char);
if(isAnagram==false)
	System.out.println("not Anagrams");
else
	System.out.println("Anagrams");
}}



