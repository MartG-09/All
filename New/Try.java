import java.util.Scanner;

public class Try {

         public static void lutealPhase(){

               Scanner inputCollector = new Scanner(System.in);

                System.out.print("  Enter how long your period lasted for(in days):  ");
                   int days = inputCollector.nextInt();

                        if(days >= 3 && days < 8){

           System.out.print("\n  Enter date of menstruation(begins):  ");
                  int number = inputCollector.nextInt();

                System.out.print("  Enter number of days in present month:  ");
                   int daysPresent = inputCollector.nextInt();
       
               int date = number + 15;
                    int dateMonth = date - daysPresent;

                int dateEnd = date + 20;
                  int endDate = dateEnd - daysPresent;

            if (date > daysPresent && dateEnd > daysPresent)    System.out.println("\n   Your menses period we end between " + dateMonth + " and " + endDate + " of next month. ");
                    if (date < daysPresent && dateEnd > daysPresent)    System.out.println("\n   Your menses period we end between " + date + " and " + endDate + " of  next month. ");   
                            if (date < daysPresent && dateEnd < daysPresent)    System.out.println("\n   Your menses period we end between " + date + " and " + dateEnd + " of this month. ");
                    
            }
                
        
                    else {
                            System.out.println("\n  Your menses period is not within the range of 3 to 7 days then you to see your Doctor!!");
                        }

    }

        public static void main(String[] args){
            lutealPhase();
        }
}
