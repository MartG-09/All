public class ArrayRange {
    public static int isRange(int[] array){
      int  largest = array[0];

        for(int count = 1; count < array.length; count++){
           if(largest < array[count]){
                largest = array[count];
            }
        }

      int  smallest = array[0];

        for(int number = 1; number < array.length; number++){
           if(smallest > array[number]){
                smallest = array[number];
            }
        }
            int range = largest - smallest;
        return range;
    }

                public static void main(String[] args){
                 int[] array = {2 , 5 , 7 , 9 , 20};
                    System.out.println(isRange(array));
                }
}
