public class OddPosition {

    public static int oddPosition(int[] array){
        int result = 0;
     for (int count = 0; count < array.length; count++){
      if (count % 2 != 0) {
       result = array[count];
}
       }
        return result;
        
    }

  public static void main(String[] args) {

        int[] array = {7 , 8 , 43 , 20 , 33 , 5 , 19 , 3};
    System.out.println(oddPosition(array));
}
}
