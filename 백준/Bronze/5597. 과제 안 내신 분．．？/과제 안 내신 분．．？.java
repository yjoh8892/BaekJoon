import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[31];
        
        for(int i = 1; i < 29; i++) {
            int suc = sc.nextInt();
            arr[suc] = 1;
        }
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != 1) {
                System.out.println(i);
            }
        }
    }
}