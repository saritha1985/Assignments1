class Arthematic{
	
	public int add(int a ,int b) {
		return a+b;
	}
}
class Adder extends Arthematic{}
public class Solution3 {

	public static void main(String[] args) {
		Adder adder=new Adder();
		System.out.println("My super class is:"+adder.getClass().getSuperclass().getName());
		System.out.print(adder.add(10,32)+" "+adder.add(10,3)+" "+adder.add(10,10)+"\n");
		

	}

}
