import java.util.Scanner;
 public class Home6 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter subtotal number: ");
     double sub = input.nextDouble();

    System.out.print("Enter gratuity rate: ");
     double rate = input.nextDouble();

    double grat = (sub * rate)/100;
     double total = sub + grat;

    System.out.printf("> Gratuity is: %.2f%n" , grat);
            System.out.printf("> Total is: %.2f%n" , total);

    }
}
