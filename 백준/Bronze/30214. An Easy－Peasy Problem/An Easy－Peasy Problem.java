import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        
        if (2 * s1 >= s2) {
            System.out.println('E');
        } else {
            System.out.println('H');
        }
    }
}