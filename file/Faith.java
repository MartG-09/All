import java.util.Scanner;
 public class Fame {
    public static void main(String[] args) {
       Scanner male = new Scanner(System.in);

    System.out.ptintln("what ya name?");
    String name = male.nextLine();

    System.out.println("Enter age: ");
    int age = male.nextInt();

        System.out.printf("Hello %s%n you are %d years old" , name , age);

        }
    }
