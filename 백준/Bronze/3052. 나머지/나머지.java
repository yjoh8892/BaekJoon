import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashSet<Integer> arr = new HashSet<Integer>(); 
        
        for(int i = 0; i < 10; i++) {
            arr.add(sc.nextInt() % 42);
        }
        
        System.out.println(arr.size());
    }
}