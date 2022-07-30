package HomeWork3;

public abstract class Car {

    public Car(){
        super();
    }

    public  void move(){
        System.out.println("Автомобиль начал движение");
    }
    public  void stop(){
        System.out.println("Автомобиль остановился");
    }
    public  void lightOn(){
        System.out.println("Фары включены");
    }
}
