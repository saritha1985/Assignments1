import java.util.Scanner;

public class Parllelogram {
	
	
	static boolean flag=true;

	static int B,H;

	static {

	Scanner scan = new Scanner(System.in);

	B = scan.nextInt();

	H = scan.nextInt();}
	public static void main (String[] args) { 
		 
		

	try{ 
		if(B>0 &&H>0) {
		int area =B*H;
		System.out.println("area"+area);}
	
		else if(B<=0 || H<=0){

	flag = false;

	throw new Exception("Breadth and height must be positive");

	} 

	}catch(Exception e){

	System.out.println(e);

	}}}

	

	
	
	


