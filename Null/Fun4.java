import java.util.Scanner;
 public class Fun4 {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

    System.out.print("Enter 2 digit integer: ");
     int num = input.nextInt();  

    int numb = num%10;
    int nub = (num/10)%10;  
           System.out.println(numb);
     System.out.println(nub);
          if (nub%numb == 0) {
            System.out.println("first digit is a multiple of second ");
    }
    else {
        System.out.println("No");
}

    }
}
