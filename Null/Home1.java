import java.util.Scanner;
 public class Home1 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of miles moved: ");
     double miles = input.nextDouble();

    double kilo = (miles * 1.6);

    System.out.printf("In kilometers is: %.2f%n" , kilo);

    }
}
