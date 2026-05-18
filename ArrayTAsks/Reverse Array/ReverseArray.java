public class ReverseArray {
    public static int[] reverse(int[] array){

            int[] newArray = new int[10];
            for (int num = 0; num < array.length; num++){
                newArray[num] = array[array.length-1-num];
                
            }

            return newArray;
    }

}
