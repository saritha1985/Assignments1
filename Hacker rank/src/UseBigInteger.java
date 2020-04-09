import java.math.BigInteger;
import java.util.Scanner;


public class UseBigInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger n=scanner.nextBigInteger();
		System.out.println(n.isProbablePrime(100)?"Prime":"NotPrime");
		

	}

}
