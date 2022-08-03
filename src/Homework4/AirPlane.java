package Homework4;

public class AirPlane implements CanFly {
    private int countPassenger;
    public AirPlane(int countPassenger){
        this.countPassenger = countPassenger;
    }
    public void fly() throws FlyException{
        if (countPassenger<0){
            throw new FlyException("Зачем пассажирскому самолету лететь без пассажиров");
        }else {
            System.out.println("Cамолет летит");
        }
    }

}


