  import java.util.Scanner;
public class Kelvony {
 public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number: ");
     int number = input.nextInt();

    switch(number) {
     case 1: System.out.println("Shoemefun");
      break;
     case 2: System.out.println("Tunde");
      break;
     case 3: System.out.println("Laolu");
      break;
     default: System.out.println("Invalid choice");
    }

    }
}
