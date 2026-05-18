import java.util.Scanner;
public class SalesCommissionCalculator {
  public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter worth of item(or -1 to stop):  ");
      double item = inputCollector.nextDouble();

    double grossSales = 0;

     while (item != -1) {
       grossSales += item;
    
        System.out.print("Enter worth of item(or -1 to stop):  ");
          item = inputCollector.nextDouble();

      }

        System.out.println("Total worth: " + grossSales);

        double commission = 200 + (0.09 * grossSales);
           System.out.println("Your commission is  " + commission);


    }
}
