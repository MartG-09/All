import java.util.Scanner;
public class PatternTwo {
 public static void main(String[] args) {
  Scanner inputCollector = new Scanner(System.in);

     System.out.print("Enter numbers of rows:  ");
       int number = inputCollector.nextInt();

        for (int count = 1; count  <= number; count++){
            
            for (int space = 1; space <= number - count; space++) System.out.print(" ");

                for (int counter = 1; counter <= count; counter++) System.out.print("*");
            
            System.out.println();
        }
        
      }
}

