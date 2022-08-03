package Homework4.advanced;

public class Worker  {
    private Watch watch;

    public Worker(Watch watch) {
        this.watch = watch;
    }
    public void getClick(){
        try {
            watch.tick();
        } catch (WatchError error){
            System.out.println(error.getMessage());
        }
    }
}
