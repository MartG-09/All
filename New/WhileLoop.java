import java.util.Scanner;
public class WhileLoop {
 public static void main(String[] args) {
    
    Scanner inputCollector = new Scanner(System.in);

    double total = 0;
      double count = 0;
    
    System.out.print("Enter grades: ");
     double grade = inputCollector.nextInt();

    while (grade != -1) {
     total = total + grade;

      count++;
    System.out.print("Enter grades: ");
     grade = inputCollector.nextInt();

    }

    if (count != 0) {
        double average = total / count;        
        int ave = (int) average;
        System.out.println(total);
       System.out.println(ave);
       }
    else {
        System.out.println("No grades were entered");
    }

    }
}
