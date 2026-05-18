import java.util.Scanner;
public class FIreDrill {
    public static void main(Stringp[] args){

        Scanner inputCollector = new Scanner(System.in);

       int[] array = new int[10];

            for(int count = 0; count < array.length; count++){
                System.out.print("Enter Scores:  ");
                  int scores = inputCollector.nextInt();

                    array[count] = scores;

                System.out.println(array[count])
            }

    }
}
