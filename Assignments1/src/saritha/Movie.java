package saritha;

public class Movie {
	private String moviename;
	private int theaternumber;
	private int price;
	
	Movie(String moviename,int theaternumber,int price){
		this.moviename =moviename;
		this.theaternumber = theaternumber;
		this.price =price;
	}
	Movie(){
		
	}

	public String getMoviename() {
		return moviename;
	}

	public int getTheaternumber() {
		return theaternumber;
	}

	public int getPrice() {
		return price;
	}

	

}
