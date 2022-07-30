package HomeWork3;

public class CarFactory {
    public static Lada createLada(){
        return new Lada();
    }
    public static Toyota createToyota(){
        return new Toyota();
    }

    //Продвинутый уровень
    //Задача №1
    // Сделать задачу №1 из базовой.
    // 1. Создать класс CarFactory, у которого есть два статических методы: создать жигули, создать toyota.
    // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
    // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
    // и вызвать характерные для нее методы.


}
