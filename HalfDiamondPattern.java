import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter any number: ");
        sc.nextInt();  

        int n = 5; 

        // Print the first asterisk row
        System.out.println("*");

        // Upper half including the middle row
        for (int i = 1; i <= n; i++) {
            System.out.print("*");  
            
            // Print increasing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Print decreasing numbers from i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println("*");  
        }

        // Lower half excluding the middle row
        for (int i = n - 1; i >= 1; i--) {
            System.out.print("*");  
            
            // Print increasing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Print decreasing numbers from i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println("*"); 
        }

        // Print the last asterisk row
        System.out.println("*");

        sc.close();  // Close the scanner
    }
}
