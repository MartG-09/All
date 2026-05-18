import java.util.Scanner;
  public class Direct {
    public static void main(String[] args) {
        Scanner math = new Scanner(System.in);

    System.out.print("Enter 1st number: ");
     int num = math.nextInt();

       System.out.print("Enter 2nd number: ");
     int num1 = math.nextInt();

    int product = num * num1;

        System.out.println("Product is: " + product);

            if (num > num1){
              System.out.printf("%s%d%s%n" , ">" , num  , " is Larger");
}
            else {
              System.out.printf("%s%d%s%n" , ">" , num1  , " is Larger");
}








            }
}

