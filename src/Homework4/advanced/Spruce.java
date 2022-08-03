package Homework4.advanced;

public class Spruce extends Tree implements Smellable {
    private String name;

    public Spruce(String name){
        this.name = name;
    }

    @Override
    public void canSmell() {
        System.out.println(this.name + ":Умеет пахнуть");
    }
}
