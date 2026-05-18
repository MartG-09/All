import java.util.Arrays;
public class Multiple {
        public static int[] returnHighestOcur(int[] array){

                    int newNum = 0;
                    int j = 0;

            for (int count = 0; count < array.length; count++){
                for (int num = count + 1; num < array.length; num++){
                    
                        if(array[count] == array[num]){
                            newNum = array[count];
                            j++;

                        }
        }
}
                    int[] code = new int[j];
                        int i = 0;
            for (int count = 0; count < array.length; count++){
                for (int num = count + 1; num < array.length; num++){
                    
                        if(array[count] == array[num]){
                            code[i] = array[count];
                                i++;
                           
                        }

                            
                }
           
        }

            return code;
    }

            public static void main(String[] args) {
               int[] array = {-1 , 4 , 3 , -1 , 1 , 5 , -1 , 2 , -1};

            System.out.println(Arrays.toString(returnHighestOcur(array)));

            }
}
