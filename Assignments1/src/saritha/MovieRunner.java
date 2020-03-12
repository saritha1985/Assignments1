package saritha;

public class MovieRunner {

	public static void main(String[] args) {
		
		Movie a = new Movie("ready",7,250);
		Movie b = new Movie("Jodi",8,300);
		Movie c =new Movie();
		
		System.out.println(a.getMoviename());
		System.out.println(a.getTheaternumber());
		System.out.println(a.getPrice());
		System.out.println(b.getMoviename());
		System.out.println(b.getTheaternumber());
		System.out.println(b.getPrice());
		
		

	}

}
