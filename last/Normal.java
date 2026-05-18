//public class Normal {
//    public static int duplicateHighest(int[] array) {
//
//            int m =0;
//        for (int count = 0; count < array.length; count++) {
//                   int j = 0;
//            for (int num = 0; num < array.length; num++){
//                if (array[count] == array[num]){
//                        j++;
//                }
//            }
//                if (m < j)
//                    m = j;
//        }
//
//            return m;
//    }
//
//            public static void main(String[] args) {
//
//               int[] array = {1 , 2 , 6 , 9 , 3 , 6 , 2 , 2 , 3 , 8 , 2 , 9 , 2};
//                    System.out.println(duplicate(array));
//            }
//
//}
//
//import java.util.Arrays;
//public class Normal {
//    public static int[] sorting(int[] array) {
//        for (int count = 0; count < array.length; count++){
//            for (int num = count + 1; num < array.length; num++) {
//                    if (array[count] > array[num]) {
//                            int dog = array[count];
//                            array[count] = array[num];
//                            array[num] = dog;
//                    }
//            }
//        }
//
//                    return array;
//    }
//
//                    public static void main(String[] args) {
//                        int[] array = {1 , 2 , 4 , 1 , 19 , 7 , 2 , 3 , 9};
//                            System.out.println(Arrays.toString(sorting(array)));
//                    }
//
//}

//


import java.util.Arrays;
//public class Normal {
//        public static int[] duplicateNumbers(int[] array){
//                int[] store = new int[array.length];
//
//                int j = 0;
//                for (int count = 0; count < array.length; count++) {
//                        for (int num = count + 1; num < array.length; num++){
//                            if (array[count] == array[num]) {    
//                                    boolean isThere = false;                          
//                                    for (int counter = 0; counter < j; counter++){
//                                            if (array[count] == store[counter]){
//                                                isThere = true;
//                                                break;
//                                            }  
//                                    }
//                                                if (!isThere) {
//                                                    store[j] = array[count];
//                                                      j++;
//                                                }   
//                            }
//                        }
//                }
//
//        int[] result = new int[j];
//        for (int n = 0; n < j; n++) {
//                result[n] = store[n];
//        }  
//
//            return result;  
//
//        }
//
//    public static void main(String[] args) {
//
//        int[] arr = {1 , 1 , 1 , 2 , 2 , 3 , 14 , 23 ,  34 ,34 , 34 , 34 , 67};
//        System.out.println(Arrays.toString(duplicateNumbers(arr)));
//
//        int[] numbers = {1, 2, 3, 2, 4, 5, 1, 6, 3};
//        System.out.println(Arrays.toString(findDuplicates(numbers)));
//
//    }
//}


public class Normal {
        public static int[] removeDuplicate(int[] array) {
            int j = 0;
            int m =0;
    int[] result = new int[j];
            int count = 0;
                for (count = 0; count < array.length; count++) {
                    boolean isSeen = false;
                    int occur = 0;
                    for (int num = 0; num < array.length; num++) {
                            if (array[count] == array[num]) {
                                     occur++;
                            }
                            if (occur > 1) {
                                isSeen = true;
                                break;
                            
                    }
                  }

                if (!isSeen) {
                        j++;
                }

                    for (int guy = m; guy < j; guy++){
                        result[guy] = array[count];
                        m++;
                }
}

            return result;
        }

    public static void main(String[] args) {

        int[] arr = {1 , 1 , 1 , 2 , 2 , 3 , 14 , 23 ,  34 ,34 , 34 , 34 , 67};
        System.out.println(Arrays.toString(removeDuplicate(arr)));
//
//        int[] numbers = {1, 2, 3, 2, 4, 5, 1, 6, 3};
//        System.out.println(Arrays.toString(removeDuplicate(numbers)));
//
    }
}



  











