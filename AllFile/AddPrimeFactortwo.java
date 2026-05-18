import java.util.Scanner;
public class AddPrimeFactortwo {
  public static void main(String[] args) {

    Scanner inputCollector = new Scanner(System.in);
      System.out.print("Enter number:  ");
       int number = inputCollector.nextInt();
        int sum = 0;

    for (int count = 2; count <= number; ) {
        int factors = number % count;
        if (factors == 0) {
       number = number / count;
         sum = sum + count;
       System.out.println(count);
//            count = count;
            }
        else{
                count++;            
                }
        }    
                        System.out.println(sum);
   }
}
