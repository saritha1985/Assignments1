package saritha;

public class BookStatus {

	public static void main(String[] args) {
		Book computerprogramming = new Book(50);
		Book java =new Book(60);
		Book cleancode = new Book(70);
 computerprogramming.read();
 java.read();
 cleancode.read();
 
 System.out.println(cleancode.getNoofcopies());
 System.out.println(computerprogramming.getNoofcopies());
 System.out.println(java.getNoofcopies());
 //computerprogramming.setNoofcopies(25);
// java.setNoofcopies(30);
 //cleancode.setNoofcopies(50);
 
	 //System.out.println(java.getNoofcopies());
	// System.out.println(cleancode.getNoofcopies());
	 //System.out.println(computerprogramming.getNoofcopies());
 
	
	//System.out.println(cleancode.getNoofcopies());
	//System.out.println(java.getNoofcopies());
	//System.out.println(computerprogramming.getNoofcopies());
	cleancode.increaseBooks();
	java.increaseBooks();
	computerprogramming.increaseBooks();
	//System.out.println(cleancode.getNoofcopies());
	//System.out.println(java.getNoofcopies());
	//System.out.println(computerprogramming.getNoofcopies());
	cleancode.decreaseBooks();
	java.decreaseBooks();
	computerprogramming.decreaseBooks();
	//System.out.println(cleancode.getNoofcopies());
	//System.out.println(java.getNoofcopies());
	//System.out.println(computerprogramming.getNoofcopies());
	
	}}


