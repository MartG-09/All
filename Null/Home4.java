import java.util.Scanner;
 public class Home4 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number in metres: ");
     double metres = input.nextDouble();

    double feet = (metres * 3.2786);

    System.out.printf("In feet is: %.4f%n" , feet);

    }
}
