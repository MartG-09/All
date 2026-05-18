public class Kata {
  public static void main(String[] args) {
        maximum(5, 7);
        isEven(10);
//        isPrimeNumber(10);
        
    }

    public static int maximum( int firstNumber, int secondNumber){
        int largest = 0;
         if (firstNumber > secondNumber) {
            largest = firstNumber;
        }
        else {
            largest = secondNumber;    
    }   
        System.out.println("The maximum number is: " + largest);
        return largest;
    }

            public static boolean isEven(int number) {
              if (number % 2 == 0){
                System.out.println("True");
                  return true;
                }
              else{
                System.out.println("False") ;
                  return false;  
                }
            }
    
//                    public static boolean isPrimeNumber(int number){
//                     int i = 2;
//                      for (; i > number ; ){
//                       if(number % i != 0){
//                          System.out.println("True");  
//                         return true;          
//                        }
//                                   return false;                      
//                            }
//                         return false;   
//
//                        }  
//                    }



} 
