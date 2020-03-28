import java.util.Scanner;

public class Formattedoutput {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		   int i=1;
		   while(scan.hasNext()) {
			   String str =scan.nextLine();
			   if(str.isEmpty()) 
				   break;
			   System.out.println(i+" "+str);
			   i++;
			   
		   }
		}}