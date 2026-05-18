import java.util.Scanner;
 public class Home14 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter weight in pounds: ");
     double pon = input.nextDouble();
    double p = pon * 0.45359237;
       System.out.println("Weight in pounds is: " + p);

    System.out.println("Enter weight in inches: ");
     double inch = input.nextDouble();
    double i = inch * 0.0254;
       System.out.println("Weight in inches is: " + i);

    }
}
