public class FlowerPattern {
    public static void main(String[] args) {
        int n = 10; // Adjust this value to change the size of the flower
        int stemHeight = 12; // Height of the stem
        int potWidth = 8; // Width of the pot
        int potHeight = 4; // Height of the pot

        // Flower (X Shape)
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (i == j || i + j == 2 * n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Stem
        for (int i = 0; i < stemHeight; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == n - 1 || j == n) {
                    System.out.print("!");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Pot
        int potStart = n - potWidth / 2;
        for (int i = 0; i < potHeight; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j >= potStart && j < potStart + potWidth) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
