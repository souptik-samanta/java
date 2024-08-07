public class FlowerPattern
    {
    public static void main(String[] args) 
        {
        
            }
            System.out.println();
        }

        // Stem
        for (int i = 0; i < stemHeight; i++)
            {
            for (int j = 0; j < 2 * n; j++) 
            {
                if (j == n - 1 || j == n) 
                {
                    System.out.print("!");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Pot
        int potStart = n - potWidth / 2;
        for (int i = 0; i < potHeight; i++)
            {
            for (int j = 0; j < 2 * n; j++)
                {
                if (j >= potStart && j < potStart + potWidth)
                {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
