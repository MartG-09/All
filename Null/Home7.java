import java.util.Scanner;
 public class Home7 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number from 0 - 1000: ");
     int num = input.nextInt();

    int dig1 = (num%10);
     int dig2 = (num/10)%10;
      int dig3 = (num/100)%10;

        int sum = (dig1+dig2+dig3);

    System.out.println("Sum of digit is: " + sum);

    }
}
