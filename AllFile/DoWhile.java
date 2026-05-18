import java.util.Scanner;
public class DoWhile {
 public static void main(String[] args) {

    Scanner inputCollector = new Scanner(System.in);

    int count = 0;
    int sum = 0;

    do {
    System.out.print("Enter number: ");
     int number = inputCollector.nextInt();
        count++;
    sum = sum + number;
    }
     while (count < 5);
    System.out.println(sum);
    
    }
}
