import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        
        for (int i = S.length() - 1; i >= 0; i--) {
            System.out.print(S.charAt(i));
        }
    }
}