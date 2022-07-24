package Lesson3;

public class Lesson4Constuct {
    private  double increment = 0.01123;
    private double result = 0;
    private int count = 0;
    final int million = 1_000_000;

    public Lesson4Constuct(double task1Increment) {
        this.increment = task1Increment;

    }

    public int Count() {
        if (increment > 0) {
            do {
                this.result = this.result + this.increment;
                this.count++;
            } while (this.result < this.million);
        } else {
            System.out.println("Поменяйте число");
        }
        return this.count;
    }
}
