import java.util.Scanner;
 public class AverageCalculator {
  public static void main (String[] args) {

    Scanner input = new Scanner(System.in);
    
    int total = 0;
    int counter = 1;

        while (counter <= 5) {
         System.out.print("Enter grade: ");
          int grade = input.nextInt();
        
        total = total + grade;
         counter++;
        
        }
    
      int average = total / 5;

  System.out.println("Total grade is " + total);
   System.out.println("Average grade is " + average);

    }
 }
