/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberconverter;
import java.util.Scanner;

public class NumberConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new object scanner
        Scanner sc = new Scanner(System.in);
        
        // Create heading as a string
        
        String heading1 = "Octal Number";
        String heading2 = "Decimal Number";
        
        // Create colon as a string
        
        String co = ":";
        
        // Print question for octal 
        
        System.out.print("Please enter a 4-digits Octal number: ");
        
        // Input an octal number
        
        int octal = sc.nextInt();
        
        // Create store of octal for display
        
        int octal_d = octal;
        
        // Create interger i as a exponent base 
        
        int i = 0;
        
        // Create interger decimal as a placeholder
        
        int decimal = 0;
        
        // Create a while looping statement for when Octal is not 0
        
        while (octal != 0){
            
        // Definite decimal as being decimal plus the remainder of octal/10 x 8 to the power of i
        
        decimal += (octal % 10) * Math.pow(8, i);
        
        // Increase i by 1
        
        ++i;
        
        // Divide octal by 10
        
        octal /= 10;
        }
            
        System.out.printf( "%-15s %1s %1s %n", heading1, co ,octal_d);
        System.out.printf( "%-15s %1s %1s %n", heading2, co ,decimal);
    }
    
}
