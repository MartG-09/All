public class HighestOfNumbers2 {

 public static int collectThreeNumbers(int firstNumber , int secondNumber , int thirdNumber) {

    int highest = firstNumber;
    
    if (highest < secondNumber) highest = secondNumber;  
   else if (highest < thirdNumber) highest = thirdNumber;   
        return highest;
    }

    public static void main(String[] args){
        System.out.println(collectThreeNumbers(5 , 7 , 2));
    }
}
