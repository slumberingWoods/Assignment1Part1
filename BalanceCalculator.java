/*
 * @author Thang Manh Tran 
 */
package balancecalculator;

import java.util.Scanner;

public class BalanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new object scanner
        Scanner sc = new Scanner(System.in);
        
        // Print question for initial balance
        
        System.out.print("Please enter the initial balance: ");
        
        // Input in intial balance as a double
        
        double init_balance = sc.nextDouble();
        
        // Print question for annual interest rate 
        
        System.out.print("Please enter the anual interest rate (2 for 2%): ");
        
        // Input interest rate as a float
        
        double interest_rate = sc.nextDouble();
        
        // Print question for number of years client want to save
        
        System.out.print("Please enter the number of years the client wants to save money in the bank: ");
        
        // Input in number of years as an interger
        
        int years = sc.nextInt();
        
        // Create heading as a string
        
        String heading1 = "Balance After " + years +  " Years";
        
        // Calculate balance after x years.
        
        double aft_balance = init_balance * (Math.pow((interest_rate+100)/100, years));
        
        // Print everything
        
        System.out.printf( "\n%-25s %1s %10s \n", "Initial Balance", ":" ,init_balance);
        System.out.printf( "%-25s %1s %9s%% \n", "Annual Interest Rate", ":" ,interest_rate);
        System.out.printf( "%-25s %1s %10s \n","Saving Years", ":" ,years);
        System.out.println("-------------------------");
        System.out.printf( "%-25s %1s %10.2f \n", heading1, ":" ,aft_balance);
    }
    
}
