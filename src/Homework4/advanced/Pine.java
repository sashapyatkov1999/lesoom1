package Homework4.advanced;

public class Pine  extends  Tree implements Smellable {
    private String name;

    public Pine(String name) {
        this.name = name;
    }
    public void canSmell(){
        System.out.println(this.name + "Умеет цвести");
    }

}
