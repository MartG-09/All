public class LoopToNine {
  public static void main(String[] args) {

   for (int count = 0; count <= 9; count++){
     for(int digit = 0; digit <= 9; digit++){
        for (int counter = 0; counter <= 9; counter++){
            for (int number = 0; number <= 9; number++){
            System.out.println(count + " " + digit + " " + counter + " " + number);
             }
         }
      }
   }
}
}
