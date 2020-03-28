import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class FindDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter month");
		String month = scan.next();
		System.out.println("enter date");
		String date =scan.next();
		System.out.println("enter year");
		String year = scan.next();
					
		LocalDate localdate =LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(date));
		DayOfWeek dayOfWeek = localdate.getDayOfWeek();
		System.out.println(dayOfWeek);
		

	}

}
