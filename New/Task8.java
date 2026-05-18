public class Task8 {
  public static void main(String[] args) {
  
      int sum =0;
    int i = 1;
        int l = 1 ;
     for (i = 1; i <= 1050; i*=4){

   sum +=i;
}
          System.out.println(sum);
     for (l = 1; l <= 100000; l*=8){
        sum +=l;
}
          System.out.println(sum);

    int sumT = (sum +=i) + (sum +=l);
      System.out.println(sumT);

    }
}
