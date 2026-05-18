public class While {
    public static void main(String[] args) {
        int energy = 5;

        // While loop: keep playing until energy runs out
        while (energy > 0) {
            System.out.println("Playing... energy left: " + energy);
            energy--;
        }
    }
}

