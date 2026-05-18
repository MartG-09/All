import java.util.Scanner;
 public class Home9 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter initial velocity: ");
     int vel = input.nextInt();

    System.out.print("Enter time taken: ");
     int time = input.nextInt();

    System.out.print("Enter accelaration: ");
     int acce = input.nextInt();

        int dist = (vel*time)+(acce*time*time)/2;

    System.out.println("Distance is: " + dist);

    }
} 
