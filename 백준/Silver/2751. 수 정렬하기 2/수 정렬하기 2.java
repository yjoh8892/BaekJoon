import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        
        Collections.sort(list);
        
        for(int value : list) {
			sb.append(value).append("\n");
		}
        
		System.out.println(sb);
    }
}