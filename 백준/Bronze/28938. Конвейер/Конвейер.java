import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        
        if (sum > 0) {
            System.out.println("Right");
        } else if (sum < 0) {
            System.out.println("Left");
        } else {
            System.out.println("Stay");
        }
    } 
}