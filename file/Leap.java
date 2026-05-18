public class Leap {
    public static void main(String[] args) {
        int count = 0;

        for (int year = 2000; year <= 2100; year++) {
            // Leap year condition
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.print(year + " ");
                count++;

                // After every 10 leap years, move to a new line
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}

