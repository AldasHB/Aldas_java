public class Task2{
    public static void main(String[] args) {
        printConversion(10.25);
        printConversion(-5.6);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.printf("%.2f km/h = %d mi/h%n", kilometersPerHour, milesPerHour);
        }
    }
}