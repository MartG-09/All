import java.util.Arrays;
public class ArrayOdd {
    public static int[] arrayOdd(int[] array) {
        
             int j = 0;
            for (int count = 0; count < array.length; count++){
                if (array[count] % 2 == 1){
                     j++;
                }
            }

                int num = 0;
                int[] newArray = new int[j];
            for (int count = 0; count < array.length; count++){
                if (array[count] % 2 == 1){
                     newArray[num] = array[count];
                        num++;
                }
            }


            return newArray;
    
    }

}
