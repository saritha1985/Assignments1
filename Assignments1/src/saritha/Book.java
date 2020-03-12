package saritha;

public class Book {
	private int noofcopies;
	
	Book(int noofcopies){
		this.noofcopies = noofcopies;
	}
	void read() {
		System.out.println("Reading finished");
		}
	public int getNoofcopies() {
	return this.noofcopies;
	}
	public void setNoofcopies(int noofcopies) {
		this.noofcopies = noofcopies;
	}
	
	public void increaseBooks() {
		this.noofcopies += 100;
	}
	public void decreaseBooks() {
		this.noofcopies -= 100;
	}
	
}