import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int sol = 1;
        
        for (int i = 0; i < N; i++) {
            sol *= 2;
        }
        
        System.out.println(sol);
    }
}