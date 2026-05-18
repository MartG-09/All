public class Method {
    public static int isPrime(int number){
        for(int count = 2; count <= number / 2; count++){
         if (number % count == 0) {
             System.out.println("False");
        }    

            else System.out.println("True");

    if(number == 1) System.out.println("False");

        return "True";
        }
}

                public static void main(String[] args){
                 isPrime(20);
                }
}
