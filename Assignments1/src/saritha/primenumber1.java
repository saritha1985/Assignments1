package saritha;

public class primenumber1 {
	private int number;
	
	primenumber1(int number){
		this.number = number;
	}
		
		public boolean isPrime() {
			for (int i=2;i<number-1;i++)
			{
				if(number%i == 0)
					return false;
			}
			
		
		return true;
	}

}
