import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        B = B + C;
        
        while(B >= 60) {
            B = B - 60;
            A = A + 1;
        }
        
        if(A >= 24) {
            A = A - 24; 
        }
        
        System.out.println(A + " " + B);
    }
}