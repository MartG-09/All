import java.util.Scanner;
public class GasMileage {
  public static void main(String[] args) {
     Scanner inputCollector = new Scanner(System.in);

    int totalMile = 0;
     int totalGallon = 0;

    System.out.print("Enter number of miles driven (or -1 to terminate):  ");
     int mile = inputCollector.nextInt();

    while (mile != -1){
     System.out.print("Enter number of gallons used:  ");
      int gallon = inputCollector.nextInt();

           double milePerGallon = (double)mile / gallon;
            System.out.println("Miles per gallon is " + milePerGallon);

     totalMile += mile;
       totalGallon += gallon;
        
               System.out.print("Enter number of miles driven (or -1 to terminate):  ");
                 mile = inputCollector.nextInt(); 
    
      }

        double totalMilePerGallon = (double)totalMile / totalGallon;
            System.out.println("Total miles per gallons is  " + totalMilePerGallon);

    }
}
