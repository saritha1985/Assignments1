import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import java.util.List;

class Student{
	private int  sid;
	private String sname;
	private double sgpa;
	public Student(int sid,String sname,double sgpa) {
		super();
		this.sid=sid;
		this.sname=sname;
		this.sgpa=sgpa;
	}
	public int getSid()
	{
		return sid;
	}
	public String getSname()
	{
		return sname;
	}
	public double getSgpa()
	{
		return sgpa;
		
	}
}
public class StudentSort {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		List<Student> studentList = new ArrayList<Student>();
		while(n>0) {
			int sid=scanner.nextInt();
			String sname= scanner.next();
			double sgpa=scanner.nextDouble();
			Student st = new Student(sid,sname,sgpa);
			studentList.add(st);
			n--;
		}
		 Collections.sort(studentList,  Comparator.comparing(Student :: getSgpa).reversed().
	              thenComparing(Student :: getSname).thenComparing(Student :: getSid));
	      
	         for(Student st: studentList){
	         System.out.println(st.getSname());
	      }
	   }
	}