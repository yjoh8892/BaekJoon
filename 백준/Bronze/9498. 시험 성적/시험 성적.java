import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int G = sc.nextInt();
        
        if(G >= 90) {
            System.out.println("A");
        } else if(G >= 80) {
            System.out.println("B");
        } else if(G >= 70) {
            System.out.println("C");
        } else if(G >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}