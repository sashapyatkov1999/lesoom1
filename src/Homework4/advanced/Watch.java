package Homework4.advanced;

public class Watch {
    private boolean broke;
    public Watch(boolean broke){
        this.broke = broke;
    }
    public void tick() throws WatchError{
        if (broke){
            throw new WatchError("Ошибка:часы сломаны");
        }
        System.out.println("Часы идут");
    }
}
