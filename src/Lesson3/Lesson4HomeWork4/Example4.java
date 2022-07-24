package Lesson3.Lesson4HomeWork4;

public class Example4 {
    public static void main(String[] args) {
        PrincipalStaff oleg = new PrincipalStaff("Олег",30,200,10);
        PrincipalStaff sasha = new PrincipalStaff("Саша",20,180,20);
        PrincipalStaff ivan = new PrincipalStaff("Иван",24,190,30);
        Stock vodkaAmount = new Stock(200);
        oleg.damagedGoods();
        System.out.println("Ура я испортил водку!" + oleg.damagedGoods());
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.



    }

}

