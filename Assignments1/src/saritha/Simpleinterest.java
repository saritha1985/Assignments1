package saritha;

import java.math.BigDecimal;




public class Simpleinterest {
	BigDecimal principal;
	BigDecimal interest;
	BigDecimal totalvalue;

	public Simpleinterest(String principal, String interest) {
		this.principal =new BigDecimal (principal);
		this.interest = new BigDecimal (interest).divide(new BigDecimal(100));
		
	}

	public BigDecimal findtotalvalue(int years) {
		
		BigDecimal totalvalue = principal.add(principal).multiply(interest).multiply(new BigDecimal(years));
		
		
		return totalvalue;
	}

}
