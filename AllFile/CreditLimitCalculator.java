import java.util.Scanner;
public class CreditLimitCalculator {
  public static void main(String[] args) {
     Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter account number(or -1 to stop):  ");
      int account = inputCollector.nextInt();

    while (account != -1) {
       System.out.print("Enter balance at the beginning of the month:  ");
         int balance = inputCollector.nextInt();

        System.out.print("Enter this month total charges:  ");
          int charges = inputCollector.nextInt();

        System.out.print("Enter credit applied to the customer account:  ");
          int credit = inputCollector.nextInt();

        System.out.print("Enter allowed credit limit:  ");
          int creditLimit = inputCollector.nextInt();

                  int newBalance = ((balance + charges) - credit);
                    System.out.println("New balance is : " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit is exceeded.");
            }
         System.out.print("Enter account number(or -1 to stop):  ");
            account = inputCollector.nextInt();


      }

   }
}
