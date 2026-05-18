import java.util.Scanner;
 public class Home5 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter square metre number: ");
     double square = input.nextDouble();

    double ping = (square * 0.3025);

    System.out.printf("To ping is: %.4f%n" , ping);

    }
}
