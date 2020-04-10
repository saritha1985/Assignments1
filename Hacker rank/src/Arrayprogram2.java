import java.util.Scanner;

public class Arrayprogram2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row,col,i,j;
		int[][] Array2= new int[6][6];
		System.out.print("Enter row for the array (max 6) : ");
	       row = scanner.nextInt();
	       System.out.print("Enter column for the array (max 6) : ");
	       col = scanner.nextInt();
		   
	       // enter array elements.
	       System.out.println("Enter " +(row*col)+ " Array Elements : ");
		for( i=0;i<6;i++) {
			
			for( j=0;j<6;j++)
			{
				Array2[i][j]=scanner.nextInt();
			}
		}
		
		System.out.print("The Array is :\n");
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {
	               System.out.print(Array2[i][j]+ "  ");
	           }
	           System.out.println();
	       }
	   }
	
	}


