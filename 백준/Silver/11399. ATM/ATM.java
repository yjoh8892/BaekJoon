import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        for (int i = 1; i < N + 1; i++) {
            arr[i - 1] = (N + 1 - i) * arr[i - 1];
            sum += arr[i - 1]; 
        }
        
        System.out.println(sum);
    }
}