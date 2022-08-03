package Homework4;

public class HomeWork4 {
    public static void main(String[] args) throws FlyException{

        Duck duck = new Duck(false);
        Duck duck1 = new Duck(true);
        AirPlane airPlane = new AirPlane(10);
        AirPlane airPlane1 = new AirPlane(-1);

        CanFly[] canFlies = {duck,duck1,airPlane,airPlane1};
        for (CanFly canFly: canFlies){
            try {
                canFly.fly();
            }catch (FlyException flyException){
                System.out.println(flyException.getMessage());
            }
        }


        //Базовый уровень
        //Задача №1
        //1. Создать два класса, которые умеют летать: самолет и утка. Атрибут утки: isInjured (ранен),
        // атрибут самолета: countPassengers.
        //2. Создать интерфейс, который объединяет эти два класса.
        //3. Имплементировать его в двух классах
        //4. Реализовать метод летать:
        // Для утки:
        // Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
        // иначе печатать на экран "утка летит"
        // Для самолета:
        // Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
        // Иначе печать "самолет летит"
        //5. Создать 1 утку не раненую, 1 утку раненую, 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
        //6. Положить их всех в массив
        //7. Перебрать массив и вызвать у каждого элемента метод летать
        // Перехватить исключения: вывести на экран message ошибки
        // Ожидание:
        // утка летит
        // Ошибка: утка ранена
        // самолет летит
        // Ошибка: пассажиров в самолете меньше 0

    }
}