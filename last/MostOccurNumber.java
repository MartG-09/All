 public class MostOccurNumber {
    public static int numberOfTimeOccur(int[] array) {
        int count = 0;
    
        for(int counter = 0; counter < array.length; counter++) {
            if(counter > 0)
             if(array[counter - 1] == array[counter])
                        continue;

            for(int number = counter + 1; number < array.length; number++) {

                if (array[counter] == array[number]){
                    
                    count++;
                }
            }
        }
                int newCount = count + 1;
            return newCount;
    }


            public static void main(String[] args) {
                int[] array = {1 , 2 , 2 , 2 , 3};
                int[] arrayNew = {1 , 5 , 5 , 6 , 4};
                System.out.println(numberOfTimeOccur(array));
                System.out.println(numberOfTimeOccur(arrayNew));
            }
}
