import java.util.Scanner;
public class AccTest {
  public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter name:  ");
     String name = inputCollector.nextLine();

    Acc myAcc = new Acc();

        myAcc.setName(name);

        System.out.println(myAcc.getName());

  }
}
