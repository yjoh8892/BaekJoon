import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextInt();
        long M = sc.nextInt();
        
        System.out.print(Math.abs(N - M));
    }
}