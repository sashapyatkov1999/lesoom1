package Homework4.advanced;

public class Advenced {
    public static void main(String[] args) {

        Rose rose = new Rose("Роза");
        Fern fern = new Fern("Папоротник");
        Pine pine = new Pine("Сосна");
        Spruce spruce = new Spruce("Ель");
        Smellable[] smellables = {spruce, pine, rose};
        for (Smellable smellable : smellables) {
            smellable.canSmell();
        }
        Bloomable[] bloomables = {rose, fern} ;
            for (Bloomable bloomable: bloomables){
                bloomable.canBloom();

        }
        //Задача №2
        //2. Создать следующую структуру из классов и интерфейсов
        // магазин (обладает работниками)
        // работник (обладает часами - (часы одни))
        // часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
        // Бренд (обладает массивом магазинов)
        // Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
        // у каждого работника по часам. У одного работника часы сломаны, у второго нет.
        // После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
        // обработать ошибку сломанных часов.
        // Ожидание вывода на экран:
        // Часы тикают
        // Ошибка: Часы сломались.
        Watch watch = new Watch(false);
        Watch watch1 = new Watch(true);
        Worker worker = new Worker(watch);
        Worker worker1 = new Worker(watch1);
        Store store = new Store(worker);
        Store store1 = new Store(worker1);
        Store[] stores = {store,store1};
        Brand brand = new Brand(stores);
        brand.getTick();



    }

}