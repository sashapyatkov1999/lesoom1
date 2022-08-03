package Homework4.advanced;

public class Fern extends Plant implements Bloomable{
    private String name;

    public Fern(String name) {
        this.name = name;
    }
    @Override
    public void canBloom(){
        System.out.println(this.name + ":Умеет цвести");
    }

}
