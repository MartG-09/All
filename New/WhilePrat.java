import java.util.Scanner;
public class WhilePrat {
  public static void main(String[] args) {
   Scanner inputCollector = new Scanner(System.in);

    int pass = 0;
    int fail = 0;
     int count = 0;

        while (count < 10) {
         System.out.print("Enter result(1 is pass & 2 is fail):  ");
          int result = inputCollector.nextInt();
         count++;

            if(result == 1){
             pass += 1;
        }
            else{
             fail += 1;
            }
}

    System.out.printf("Passed: %d%nFailed: %d%n" , pass , fail);
        if(pass > 8){
             System.out.println("Bonus to instructor");
        }

    }
}   
