package Homework4;

public class Duck implements CanFly {
    private boolean isInjured;
    public Duck(boolean isInjured){
        this.isInjured = isInjured;
    }
    public void fly() throws FlyException {
        if (isInjured){
            throw new FlyException("Ошибка :Утка ранена");
        }else {
            System.out.println("Утка летит");

    }
}
}
