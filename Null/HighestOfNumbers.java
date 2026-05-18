public class HighestOfNumbers {

 public static int collectThreeNumbers(int number) {
        for (int i = number; i != -1; i++){
    collectThreeNumbers(number);

    int highest = number;
    
    if (highest < number) highest = number;  
}
//   else if (highest < thirdNumber) highest = thirdNumber;   
        return highest;
    }

//    public static int anyNumbers(){
//        for (int i = number; i != -1; i++){
//    collectThreeNumbers(int number);
//}
//     }

    public static void main(String[] args){
        System.out.println(collectThreeNumbers(4 , 7 , 10 , 5 , 72));
        
    }
}
