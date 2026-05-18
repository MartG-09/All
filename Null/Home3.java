import java.util.Scanner;
 public class Home3 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter length of triangle: ");
     double len = input.nextDouble();

    double len2 = len*len;
     double root = Math.sqrt(3.0/4.0);
       double area = len2 * root;

        double vol = area * len;

    System.out.printf("Volume of triangular prism is: %.2f%n" , vol);

    }
}
