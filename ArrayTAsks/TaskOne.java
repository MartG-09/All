import java.util.Arrays;
import java .util.Scanner;

public class TaskOne {
    public static String returnArray(){
        Scanner inputCollector = new Scanner(System.in);
        
        int[] array = new int[10];
         for (int count = 0; count < array.length; count++) {
            System.out.print("Enter number :  ");
                int number = inputCollector.nextInt();
        
            array[count] = number;
        }
            return (Arrays.toString(array));
    }

}
