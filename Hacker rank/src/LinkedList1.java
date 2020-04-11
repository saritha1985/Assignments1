import java.util.Scanner;
import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList<>();
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			int value =scanner.nextInt();
			myList.add(value);
		}
		int queries =scanner.nextInt();
		String str;
		
		for(int j=1;j<queries;j++)
		{
			
			 str=scanner.next();
			 
			if(str.equals("insert")) 
			{
				int index = scanner.nextInt();
			 int value = scanner.nextInt();
		
			myList.add(index,value);
		}else {
			int index = scanner.nextInt();
			myList.remove(index);
		}}
		scanner.close();
		for(Integer num:myList) {
			System.out.print(num+" ");
		}
			
			
	}
}	