public class SumArr {
            
    public static int largest(int[] array){
        int largest = array[0];
        
        if (array[1] > largest) largest = array[1];
          if(array[2] > largest) largest = array[2];

    return largest;
    }


  public static void main(String[] args) {
    int[] array = {6 , 24 , 8};
     System.out.println(largest(array));

  }
}
//
//
//public class SumArr {
//
//    public static int largest(int[] array) {
//        int largest = array[0]; // start with the first element
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > largest) {
//                largest = array[i];
//            }
//        }
//        return largest;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(largest(new int[]{6, 24, 8}));
//    }
//}

