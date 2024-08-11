import java.util.Scanner;

class Volume_cal {
    // Method to calculate the volume of a cube
    int vol(int s) {
        int v1 = s * s * s;
        return v1;
    }

    // Method to calculate the volume of a sphere
    double vol(double r) {
        double v2 = (4.0 / 3.0) * 3.14 * r * r * r;
        return v2;
    }

    // Method to calculate the volume of a cuboid
    double vol(double l, double b, double h) {
        double v3 = l * b * h;
        return v3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of the Volume_cal class
        Volume_cal volumeCalculator = new Volume_cal();

        // Input for cube
        System.out.print("Enter the side of the cube: ");
        int side = scanner.nextInt();
        int cubeVolume = volumeCalculator.vol(side);
        System.out.println("Volume of the cube: " + cubeVolume);

        // Input for sphere
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        double sphereVolume = volumeCalculator.vol(radius);
        System.out.println("Volume of the sphere: " + sphereVolume);

        // Input for cuboid
        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the cuboid: ");
        double breadth = scanner.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double height = scanner.nextDouble();
        double cuboidVolume = volumeCalculator.vol(length, breadth, height);
        System.out.println("Volume of the cuboid: " + cuboidVolume);

      
    }
}
