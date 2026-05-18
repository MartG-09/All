public class HalfDiamond2 {
  public static void main(String[] args) {

 for (int count = 1; count <= 5; count++) {
   for (int i = 5; i >= count; i--) {
        System.out.print("  ");
}
    for (int counter = 1; counter <= count; counter++){
        System.out.print("  * ");
     }
        System.out.println();
  
   }

 for (int count = 4; count >= 1; count--) {
   for (int i = count; i <= 5; i++) {
        System.out.print("  ");
}
    for (int counter = 1; counter <= count; counter++){
        System.out.print("  * ");
     }
        System.out.println();
  
   }
}
}
