  import java.util.Scanner;
public class Kelvin {
 public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number: ");
     double numberOne = input.nextDouble();
    
    System.out.print("Enter number: ");
     double numberTwo = input.nextDouble();


     int division = (int)numberOne / (int)numberTwo;

        System.out.println(division);

    }
}
