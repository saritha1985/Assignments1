import java.util.Scanner;

public class SubArray1 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the lenth of the Arrray:");
	int n = scanner.nextInt();
	int[] myArray=new int[n];
	int res=0;
	System.out.println("Enter the array elements:");
	/*for(int j=0;j<n;j++)
	{
		myArray[j]=scanner.nextInt();
	}*/
	for (int i=0; i<n; i++){
        myArray[i]=scanner.nextInt();
        int s= myArray[i];
        if (s< 0) res++;
        for (int j=i-1; j>=0; j--){
            s+=myArray[j];
            if (s<0) res++;
        }
    }
	System.out.println("number of subarrays having negative sums" +res);	

	}

}
