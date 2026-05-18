import java.util.Scanner;

public class PizzaApp {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println(">>> W E L C O M E   T O   P I Z Z A   W A H A L A <<<");
        System.out.println("         . Order your PIZZA!! without WAHALA!! .");
        System.out.println("\n     >  Select any PIZZA of your choice <");
        System.out.println("== Pizza type            Number of slices        Price per box ==");
        System.out.println("\n   1. Sapa size                 4                       2500");
        System.out.println("\n   2. Small money               6                       2900");
        System.out.println("\n   3. Big boys                  8                       4000");
        System.out.println("\n   4. Odogwu                   12                       5200");

        System.out.print("Choose any option of your choice:  ");
        int option = inputCollector.nextInt();

        System.out.print("\nEnter number of people:  ");
        int people = inputCollector.nextInt();

        switch(option) {
            case 1: calculatePizza("SAPA SIZE", people, 4, 2500); break;
            case 2: calculatePizza("SMALL MONEY", people, 6, 2900); break;
            case 3: calculatePizza("BIG BOYS", people, 8, 4000); break;
            case 4: calculatePizza("ODOGWU", people, 12, 5200); break;
            default: System.out.println("\nInvalid input, try again!!");
        }
    }

    public static void calculatePizza(String name, int people, int slicesPerBox, int pricePerBox) {
        System.out.println("\n= " + name + " =");

        int boxes = people / slicesPerBox;
        if (people % slicesPerBox == 0) {
            System.out.println("\n> Number of box needed is: " + boxes);
            System.out.println("\n> Number of slices left over is: 0 Slices left");
            System.out.println("\n> Amount to be paid is: " + (boxes * pricePerBox));
        } else {
            int totalBoxes = boxes + 1;
            int leftover = (slicesPerBox * totalBoxes) - people;
            System.out.println("\n> Number of box needed is: " + totalBoxes);
            System.out.println("\n> Number of slices left over is: " + leftover + " Slices left");
            System.out.println("\n> Amount to be paid is: " + (totalBoxes * pricePerBox));
        }
    }
}

