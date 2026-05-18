import java.util.Scanner;
public class AccTest {
  public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    Acc myAcc = new Acc();

    Syetem.out.print("Enter name:  ");
     String name = inputCollector.nextLine();

        myAcc.setName(name);

        System.out.println(myAcc.getName());

  }
}
