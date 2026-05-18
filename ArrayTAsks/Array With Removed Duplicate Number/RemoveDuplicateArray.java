public class RemoveDuplicateArray {
    public static int removeDuplicate(int[] array){

             int j = 0; 
                int n = 0;
            for (int count = 0; count < array.length; count++){
                    for(int counter = 0; counter < array.length; counter++){
                            if (array[count] == array[counter]){
                               j++;
    
                            }
                                if (0 < j <= 1) n++;
                    }
            }
    
                    return n;

    }

                public static void main(String[] args) {
                    int[] array ={1,5,5,6,7,7,7,7,7,7,7,5,5,5,5,7,7,5,4};
                    System.out.println(removeDuplicate(array));
                }

}
