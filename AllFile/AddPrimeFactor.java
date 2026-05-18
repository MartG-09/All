import java.util.Scanner;
public class AddPrimeFactor {
  public static void main(String[] args) {

    Scanner inputCollector = new Scanner(System.in);
      System.out.print("Enter number:  ");
       int number = inputCollector.nextInt();

    for (int count = 1; count <= number; count++) {
        int factors = number % count;
        if (factors == 0) {
          System.out.println(count);

            }
        }    

   }
}
