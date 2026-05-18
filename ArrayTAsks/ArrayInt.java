import java.util.Scanner;
public class ArrayInt {
    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);        

        int[] array = new int[10];
        for (int count = 0; count < array.length; count++) {
            System.out.print("Enter number :  ");
                int number = inputCollector.nextInt();
        
            array[count] = number;
        }
            int letter = 0;
            for (int num = 0; num < array.length / 2; num++){
                letter = array[num];
                array[num] = array[array.length - 1 - num];
                array[array.length - 1 - num] = letter;

            }
                for (int each : array){
                    System.out.println(each);
                }
    }
}
