package Patterns;

public class hollow_rhombus2 {
    public static void main(String[] args) {
        int n = 5;
    int sp = 0;
    for(int i = 1; i <= n; i++) {
        // Print leading spaces
        for(int j = 1; j <= sp; j++) {
            System.out.print(" ");
        }

        // Print stars
        for(int j = 1; j <= n; j++) {
            // Print star at boundary
            if (j == 1 || i==1 || j==n || i == n) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        
        // Update values for spaces and stars for the next row
        if (i < n) {  // We don't print spaces for the bottom row
            sp++; // Increase the leading spaces
        }

        System.out.println();
    }

    }
}
