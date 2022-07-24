package Lesson3.Lesson4HomeWork4;

public class PrincipalStaff {
    private String name;
    private int age;
    private int height;
    int vodka;
    int damagedVodka = 0;

    public PrincipalStaff(String name,int age, int height,int vodka){
        this.age = age;
        this.height = height;
        this.name = name;
        this.vodka = vodka;

    }


    public  int setVodka(){
        this.vodka =Stock.countVodka - this.vodka;
        return this.vodka;
    }
    public int damagedGoods() {
        damagedVodka = setVodka() + vodka;

        return damagedVodka;
    }
}
