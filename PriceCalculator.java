/*
 * @author Thang Manh Tran
 */
package pricecalculator;
import java.util.Scanner;

public class PriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Scanner
        Scanner sc = new Scanner(System.in);

        // Create divider as a string

        String divider = "---------------------------";

        // Ask user to input the price of the item

        System.out.print("Please enter the item price: ");
        double i_price = sc.nextDouble();

        // Ask user to input the discount ratio

        System.out.print("Please enter the discount ratio (5 for 5%): ");
        double discount = sc.nextDouble();

        // Calculate discount price before tax as a dobule using "i_price" and "discount"

        double discount_price = i_price - (i_price*(discount/100));

        // Declare fedral and provincial tax rate as double

        double fedRate = 0.05;
        double provRate = 0.09975;

        // Calculate federal and provincial tax constants as a double

        double fedTax = discount_price * fedRate;
        double provTax = discount_price * provRate;

        // Calculate final price

        double final_price = discount_price + fedTax + provTax;

        // Print results
        System.out.printf("\n%-17s %1s %2.2f \n", "Original Price", ":", i_price);
        System.out.printf("%-17s %1s %2.2f%% \n", "Discount Ratio", ":", discount);
        System.out.printf("%-17s %1s %2.2f \n", "Price Before Tax", ":", discount_price);
        System.out.println(divider);
        System.out.printf("%-17s %1s %2.2f \n", "Federal Tax", ":", fedTax);
        System.out.printf("%-17s %1s %2.2f \n", "Provincial Tax", ":", provTax);
        System.out.printf("%-17s %1s %2.2f \n", "Final Price", ":", final_price);

    }

}
