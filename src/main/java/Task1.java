public class Task1 {
    public static void main(String[] args) {
        double kilometersPerHour = 1000;
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour == -1) {
            System.out.println("Invalid input. Please try again");
        } else {
            System.out.println("Speed in miles per hour: " + milesPerHour);
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }
}
