 package Lesson3;

public class Lesson4Homework3 {
    boolean hasFuel  = true;
    boolean hasElectricsProblem = false ;
    boolean hasMotorProblem  = false;
    boolean hasTransmissionProblem = false;
    boolean hasWheelsProblem = false;
    private boolean[] massive = new boolean[]{hasFuel, hasWheelsProblem, hasElectricsProblem, hasMotorProblem, hasTransmissionProblem};
    double balance = 0;
    int moneyForDiagnostic = 1000;
    int moneyForElectronic = 5000;
    int moneyForMotor = 10000;
    int moneyForTransmission = 4000;
    int moneyForWheels = 2000;
    int count = 0;
    /*  public  Lesson4Homework3(boolean hasFuel,boolean hasWheelsProblem,boolean hasElectricsProblem,boolean hasMotorProblem,boolean hasTransmissionProblem){
        this.hasFuel = hasFuel;
        this.hasWheelsProblem = hasWheelsProblem;
        this.hasElectricsProblem = hasElectricsProblem;
        this.hasMotorProblem = hasMotorProblem;
        this.hasTransmissionProblem = hasTransmissionProblem;

    }*/

    public double setIsFuel(){
        if (hasFuel == true && (hasWheelsProblem == true ||hasElectricsProblem == true  || hasMotorProblem == true || hasTransmissionProblem == true )){
            balance = 0;
        }else         if (hasFuel == true && (hasWheelsProblem == false ||hasElectricsProblem == false  || hasMotorProblem == false || hasTransmissionProblem == false )) {
            balance = moneyForDiagnostic;
        }
        return  this.balance;

    }
    public double setIsElectricsProblem(){
        if (hasElectricsProblem == true){
            balance =moneyForElectronic;
        }
        return this.balance;
    }
    public double setIsMotorProblems(){
        if (hasMotorProblem == true){
            balance = moneyForMotor;
        }
        return this.balance;
    }
    public double setTransmissionProblems(){
        if (hasTransmissionProblem == true){
            balance = moneyForTransmission;
        }
        return this.balance;
    }
    public double setWheelProblems(){
        if (hasWheelsProblem == true){
            balance = moneyForWheels;
        }
        return this.balance;
    }


    public int set1Change() {
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == true) {
                count++;
            }
        }

        return this.count;

    }

    public double setSale() {

        for (int i = 0; i < massive.length; i++) {
            if (set1Change() == 1) {
                if (massive[0] == false && massive[0] == true) {
                    balance = (setIsFuel() + setIsElectricsProblem() + setWheelProblems() + setTransmissionProblems() + setIsMotorProblems());
                }
                break;
            }
            if (set1Change()>=2){
                if (massive[4]==true &&(massive[3]==true || massive[2]==true ) ){
                    balance = (setIsFuel() +setIsElectricsProblem() + setWheelProblems() + setTransmissionProblems() + setIsMotorProblems()) * 0.8;
                    break;
                }
                else if (massive[i] == true){
                    balance = (setIsFuel() +setIsElectricsProblem() + setWheelProblems() + setTransmissionProblems() + setIsMotorProblems()) -
                            (setIsFuel() + setIsElectricsProblem() + setWheelProblems() + setTransmissionProblems() + setIsMotorProblems())/100*10;
                    break;
                }
                break;
            }


        }

        return this.balance;
    }
}
