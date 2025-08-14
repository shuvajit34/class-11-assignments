import java.util.Scanner;

class Temperature {
    double max;
    double min;

    Temperature(double initialMax, double initialMin) {
        max = 0.0;
        min = 0.0;
    }

    void accept_temperatures() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter maximum temperature in Celsius: ");
        this.max = scanner.nextDouble();
        System.out.print("Enter minimum temperature in Celsius: ");
        this.min = scanner.nextDouble();
    }

    void compute_fahrenheit() {
        this.max = (9.0 * this.max / 5.0) + 32;
        this.min = (9.0 * this.min / 5.0) + 32;
    }

    void display_fahrenheit() {
        System.out.println("\nMaximum temperature in Fahrenheit: " + this.max);
        System.out.println("Minimum temperature in Fahrenheit: " + this.min);
    }

    public static void main(String[] args) {
        Temperature temp = new Temperature(0.0, 0.0);
        temp.accept_temperatures();
        temp.compute_fahrenheit();
        temp.display_fahrenheit();
    }
}
