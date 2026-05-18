import java.util.Scanner;
 public class Fun {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

    System.out.print("Enter 1st number: ");
     int largest = input.nextInt();    
 
    System.out.print("Enter 2nd number: ");
     int second = input.nextInt();
      
          if (second > largest) {
            System.out.println("Largest number is = " + second);
    }

    System.out.print("Enter 3rd number: ");
     int third = input.nextInt();
      
          if (third > largest) {
            System.out.println("Largest number is = " + third);
    }

    System.out.print("Enter 4th number: ");
     int fourth = input.nextInt();
      
          if (fourth > largest) {
            System.out.println("Largest number is = " + fourth);
    }
    
    }
}
