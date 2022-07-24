 package Lesson3;

public class Lesson4Homework3 {
    boolean hasFuel;
    boolean hasElectricsProblem;
    boolean hasMotorProblem;
    boolean hasTransmissionProblem;
    boolean hasWheelsProblem;
    private int money = 0;
    public Lesson4Homework3(boolean hasFuel, boolean hasElectricsProblem , boolean hasMotorProblem,
                            boolean hasTransmissionProblem, boolean hasWheelsProblem){
        this.hasFuel = hasFuel;
        this.hasElectricsProblem = hasElectricsProblem;
        this.hasMotorProblem = hasMotorProblem;
        this.hasTransmissionProblem = hasTransmissionProblem;
        this.hasWheelsProblem = hasWheelsProblem;
    }
    public int Sale(){

        int count = 0;
        if ((!hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem)) {
            money += 1000;
        }
        if (hasFuel) {
            if (hasMotorProblem) {
                money += 10000;
                count++;
            }
            if (hasElectricsProblem) {
                money += 5000;
                count++;
            }
            if (hasTransmissionProblem) {
                money += 4000;
                count++;
            }
            if (hasWheelsProblem) {
                money += 2000;
                count++;
            }
            if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
                money = (int) (money * 0.8);
            } else if (count == 2) {
                money = (int) (money * 0.9);
            }
        }
        System.out.println("Сумма за ремонт = " + money + " рублей.");
        return money;
    }
}