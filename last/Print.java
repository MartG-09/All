import java.util.Scanner;
public class Print {
  public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter name: ");
     String name = inputCollector.nextLine();

    System.out.println(name + " You are an adult");
   }
}
