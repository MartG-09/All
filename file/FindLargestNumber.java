 import java.util.Scanner;
public class FindLargestNumber {
  public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

    int number = 0;
    int counter = 1;
      int largest = 0;
     while (counter <= 10) {
       System.out.print("Enter number " + counter + ":  ");
         number = inputCollector.nextInt();

               if (largest < number) {
                 largest = number;
                    }
                counter++;
        }
    System.out.println(largest);

    }
}
