import java.util.Scanner;

public class BMICalculator {

    /**
     * Calculates the Body Mass Index (BMI) using the weight and height provided.
     * 
     * @param weight The weight of the person in kilograms.
     * @param height The height of the person in meters.
     * @return double The BMI value.
     * 
     * @example
     * Input: weight = 70, height = 1.75
     * Output: 22.86
     */
    public static double calculateBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive values.");
        }

        // Calculate BMI using the formula: weight / (height * height)
        double bmi = weight / (height * height);

        return bmi
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        scanner.close(;

        try {
            double bmi = calculateBMI(weight, height);
            System.out.println("Your BMI is: " + bmi);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
