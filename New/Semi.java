public class Semi {
 public static void main(String[] args) {

    for (int count = 1; count <= 5; count++) {
        for (int counter = count; counter >= 1; counter--) {
            System.out.print(counter);
        }
            for (int stunt = ((5 - count) * 2); stunt >= 1; stunt--) {
               System.out.print(" ");
                }
        for (int number = 1; number <= count; number++) {
            System.out.print(number);
         }
    System.out.println();
    }
  } 
}
