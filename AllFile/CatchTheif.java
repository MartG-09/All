import java.util.Scanner;
public class CatchTheif {
  public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);
            System.out.print("Enter ' 9 ' to pursue Theif:  ");
               int start = inputCollector.nextInt();

        int number = start;
        while (true){
            if (start != 9) break;
            
            System.out.print("Catch Thief (enter ' Theif ' to stop):  ");
            String stop = inputCollector.next().toLowerCase();


            if(stop.equals("thief")) break;
                number++;
        }

        System.out.println("Thief has been caught");
   }
}
