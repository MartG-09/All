import java.util.Scanner;
 public class Home12 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter velocity: ");
     double vel = input.nextDouble();

    System.out.print("Enter accelaration: ");
     double acce = input.nextDouble();

        double dist = (vel*vel)/(acce*2);

    System.out.printf("Length of runway needed is: %.2f%n " , dist);

    }
} 
