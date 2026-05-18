public class HalfDiamond {
  public static void main(String[] args) {

 for (int count = 1; count <= 5; count++) {
    for (int counter = 1; counter <= count; counter++){
        System.out.print(" * ");
     }
        System.out.println();
   }


 for (int count = 4; count >= 1; count--) {
    for (int counter = 1; counter <= count; counter++){
        System.out.print(" * ");
     }
        System.out.println();
   }

  }
}
