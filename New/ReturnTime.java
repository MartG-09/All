public class ReturnTime {
    public static double minuteToSecondsAndHour(double minute){
        double seconds = minute * 60;
        double hour = minute / 60;
        return seconds;
    }

        public static void main(String[] args){
             int minute = 30;
                System.out.println(minuteToSecondsAndHour(minute));
        }
}
