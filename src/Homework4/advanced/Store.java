package Homework4.advanced;

public class Store {
    private Worker worker;

    public Store(Worker worker) {
        this.worker = worker;
    }
    public void getClick(){
        this.worker.getClick();
    }
}
