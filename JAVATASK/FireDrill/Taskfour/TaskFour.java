import java.util.Arrays;
public class TaskFour {
    public static int[] evenIndexArray(int[] array){
            
            int size = (array.length + 1) / 2;
        int[] newArray = new int[size];

                int j = 0;
            for(int count = 0; count < array.length; count++){
                if(count % 2 == 0){
                    newArray[j] = array[count];
                       j++;
                }
            }
            return newArray;
    }

            public static void main(String[] args){
                int[] array = {12 , 2 , 46 , 48 , 3};
                 System.out.println(Arrays.toString(evenIndexArray(array)));
            }
}
