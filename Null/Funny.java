import java.util.Scanner;
 public class Funny {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

    System.out.print("Enter 1st number: ");
     int first = input.nextInt();    
 
    int largest = first;

    System.out.print("Enter 2nd number: ");
     int second = input.nextInt();
      
          if (second > largest) {
            largest = second;
    }

    System.out.print("Enter 3rd number: ");
     int third = input.nextInt();
      
          if (third > largest) {
            largest = third;
    }

    System.out.print("Enter 4th number: ");
     int fourth = input.nextInt();
      
          if (fourth > largest) {
            largest = fourth;
    }
    
    System.out.println("The largest is " + largest);
  
    }
}
