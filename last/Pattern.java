import java.util.Scanner;
public class Pattern{
 public static void main(String[] args) {
  Scanner inputCollector = new Scanner(System.in);

     System.out.print("Enter numbers of rows:  ");
       int number = inputCollector.nextInt();

    int count = 1;
//      int counter = 1;

    while (count <= number){
      int counter =1;
       while (counter <= count){   
     System.out.print(" * ");
        counter = counter + 1   ; 
     
    }
            System.out.println(" ");
        count++;
    
        }
      }
}
