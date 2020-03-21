import java.util.Scanner;

public class PrintFormat {
    private static void printRowOutlined(String left, int right) {
        System.out.printf("%-15s", left);
        System.out.printf("%03d\n", right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String text = sc.next();
            int number = sc.nextInt();
            printRowOutlined(text, number);
        }
        System.out.println("================================");
    }
}
    
