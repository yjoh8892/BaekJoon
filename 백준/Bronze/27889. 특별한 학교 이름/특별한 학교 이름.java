import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        
        if (S.equals("NLCS")) {
            System.out.println("North London Collegiate School");
        } else if (S.equals("BHA")) {
            System.out.println("Branksome Hall Asia");
        } else if (S.equals("KIS")) {
            System.out.println("Korea International School");
        } else if (S.equals("SJA")) {
            System.out.println("St. Johnsbury Academy");
        }
    }
}