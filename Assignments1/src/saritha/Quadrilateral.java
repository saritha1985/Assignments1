package saritha;

public class Quadrilateral {
	private int sides;
	private int parllel;
	private String name;
	
	Quadrilateral(int sides,int parllel,String name){
		this.sides = sides;
		this.parllel =parllel;
		this.name =name;
	}
	Quadrilateral(){
		}
		
		
	
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public int getParllel() {
		return parllel;
	}
	public void setParllel(int parllel) {
		this.parllel = parllel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
