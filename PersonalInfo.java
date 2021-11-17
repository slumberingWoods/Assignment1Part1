/*
 * @author Thang Manh Tran 
 */
package personalinfo;
import java.util.Scanner;

public class PersonalInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new object scanner
        Scanner sc = new Scanner(System.in);
        
        // Print question for name
        System.out.print("Please enter your name: ");
        
        // Input in name as a string
        String name = sc.nextLine();
        
        //Print question for age
        
        System.out.print("Please enter your age: ");
        
        // Input in age as a interger
        
        int age = sc.nextInt();
        
        // Consume the leftover new line
        
        sc.nextLine();
        
        
        //Print question for gender
        
        System.out.print("Please enter your gender: ");
        
        // Input in gender as a string
        
        String gender = sc.nextLine();
        
        
        //Print question for gender
        
        System.out.print("Please enter your department: ");
        
        // Input in gender as a string
        
        String department = sc.nextLine();
        
        //Print question for PI
        
        System.out.print("Please enter the values of PI (3.1415926): ");
        
        //Input in digits of PI as a double
        
        double PI = sc.nextDouble();
        
        // Print results
        System.out.printf( "\n%-15s %1s %1s \n", "Name", ":" ,name);
        System.out.printf( "%-15s %1s %1s \n", "Age", ":" ,age);
        System.out.printf( "%-15s %1s %1s \n", "Gender", ":" ,gender);
        System.out.printf( "%-15s %1s %1s \n", "Departmemt", ":" ,department);
        System.out.printf( "%-15s %1s %1.2f \n", "PI", ":" ,PI);
        
    }
    
}
