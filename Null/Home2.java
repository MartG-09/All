import java.util.Scanner;
 public class Home2 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter length of triangle: ");
     double len = input.nextDouble();

    double len2 = len*len;
     double root = Math.sqrt(3.0/4.0);
       double area = len2 * root;

    System.out.printf("Area of triangle is: %.2f%n" , area);

    }
}
