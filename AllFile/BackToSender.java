public class BackToSender {
  public static int BackToSenderLogistic(int successfulDelivery) {

    int result = 0;

       if (successfulDelivery < 50) {
        result = ((successfulDelivery * 160) + 5000);
      }

      else if (successfulDelivery >= 70) {
       result = ((successfulDelivery * 500) + 5000);
      }

      else if (successfulDelivery >= 60) {
       result = ((successfulDelivery * 250) + 5000);
      }

      else if (successfulDelivery >= 50) {
        result = ((successfulDelivery * 200) + 5000);
      }
        return result;
}
    public static void main(String[] args){
System.out.println(BackToSenderLogistic(25));
System.out.println(BackToSenderLogistic(80));
  }
} 
