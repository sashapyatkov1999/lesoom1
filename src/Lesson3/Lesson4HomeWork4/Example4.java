package Lesson3.Lesson4HomeWork4;

public class Example4 {
    public static void main(String[] args) {
        PrincipalStaff oleg = new PrincipalStaff("Олег");
        PrincipalStaff sasha = new PrincipalStaff("Саша");
        PrincipalStaff ivan = new PrincipalStaff("Иван");
        Stock stock = new Stock(100);
        oleg.setVodka(stock, 20);
        sasha.setVodka(stock, 10);
        ivan.setVodka(stock, 15);
        System.out.println(oleg.getLogBook());
        System.out.println(sasha.getLogBook());
        System.out.println(ivan.getLogBook());
        System.out.println("Остаток на складе: " + stock.getBalance() + "шт.");
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.



    }

}

