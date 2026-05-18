import java.util.Scanner;
public class ArrayTenInput {
  public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

    int[] collected = new int[10];

    for (int count = 0; count < collected.length; count++){
        System.out.print("Enter number:  ");
         int number = inputCollector.nextInt();

        collected[count] = number;
    }
    for(int counter = 0; counter < 10; counter++){
        System.out.print(collected[counter] + "  ");
    }


  }
}
