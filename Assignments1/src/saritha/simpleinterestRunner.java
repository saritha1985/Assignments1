package saritha;

import java.math.BigDecimal;

public class simpleinterestRunner {

	public static void main(String[] args) {
	Simpleinterest calculator =  new Simpleinterest("4500.00","7.5");
	
	BigDecimal totalvalue = calculator.findtotalvalue(5);
	System.out.println(totalvalue);
	
	

	}

}
