public class Pty {
    public static void main(String[] args){

    int[][] myNumbers = { {1, 60, 2}, {3, 6, 8, 5, 12} };

                int largest = 0;
        for(int[] count : myNumbers){
            for(int counter : count){

                    if(largest < counter){
                            largest = counter;
                    }
            }


        }
            System.out.println(largest);
    }
}
