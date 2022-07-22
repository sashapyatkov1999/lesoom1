package Lesson4HomeWork4;

public class PrincipalStaff {
    private String name;
    private int age;
    private int height;
    static int vodka;

    public PrincipalStaff(String name,int age, int height,int vodka){
        this.age = age;
        this.height = height;
        this.name = name;

    }
    public static int setVodka(){

        return vodka;
    }
}
