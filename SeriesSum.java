
class SeriesSum {
    int product(int a, int b) {
        return a * b;
    }

    void calculate() {
        int sum = 0;
        for (int i = 1; i <= 19; i++) {
            sum = sum + product(i, i + 1);
        }
        
        System.out.println("The sum of the series is: " + sum);
    }

    public static void main(String args[]) {
        SeriesSum obj = new SeriesSum();
        obj.calculate();
    }
}
