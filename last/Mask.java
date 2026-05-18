public class Mask{
  public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {// outer loop
    if (i % 4 == 0){
    for (int j = 1; j <= 5; j++) {    // inner loop
        System.out.print(i);
    }
System.out.print(" ");
}
}
}
}
