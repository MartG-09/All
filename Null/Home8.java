import java.util.Scanner;
 public class Home8 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of minutes: ");
     int mins = input.nextInt();

    int year = (mins/525600);
     int day = (mins%525600)/1440;
       int minute = (mins%525600)%1440;

    System.out.println("We have " + year + "yrs, " + day + "days, " + minute + " in " + mins + "mins");

    }
} 
