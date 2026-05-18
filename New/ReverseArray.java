public class ReverseArray {
  
    public static int reverseArray(int[] array){
        int result = 0;
        int length = (array.length - 1);
      for(int count = length; count >= 0; count--){
       result = array[count];
        System.out.print(result);
        }
       return result;
    }

public static void main(String[] args) {
    int[] array = {1 , 2 , 3};
//      System.out.print(reverseArray(array));
  }
}
