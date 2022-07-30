package HomeWork3;

import java.io.*;
import java.util.Random;

public class main {
    public static void main(String[] args) throws IOException {

        Lada lada = new Lada();
        lada.crashCar();
        Toyota toyota = new Toyota();
        toyota.musicOn();


        //Задача №2
        //Необходимо:
        // 1. Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 2. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"
        FileReader fileReader = new FileReader("C:\\Users\\skidrow\\IdeaProjects\\lesson1'\\src\\HomeWork3\\resource\\my_first_file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String result = "";
        while (bufferedReader.ready()) {
            result += bufferedReader.readLine();
        }
        System.out.println(result);
        fileReader.close();

        //Продвинутый уровень
        //Задача №1
        // Сделать задачу №1 (1 и 2 пункты) из базовой.
        // 1. Создать класс CarFactory, у которого есть два статических метода: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.
        Car[] car = new Car[40];
        for (int i = 0; i < car.length / 2; i++) {
            car[i] = CarFactory.createLada();
            car[i + car.length / 2] = CarFactory.createToyota();
        }
        for (Car qwerty : car) {
            if (qwerty instanceof Lada) {
                Lada myCar = (Lada) qwerty;
                myCar.crashCar();
            } else {
                Toyota myCar = (Toyota) qwerty;
                myCar.musicOn();
            }
        }



//        Random random = new Random(1);
//        random.nextInt(10000);
        //Задача №2
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (используй random)
        // 4. Записать в файл "report.txt" все данные из отчетов.
        // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)
        int incomes = 0;
        int outcomes = 0;
        Random random = new Random(1);
        random.nextInt(10000);
        Financial_record[] financial_records = new Financial_record[10];
        FileWriter fileWriter = new FileWriter("C:\\Users\\skidrow\\IdeaProjects\\lesson1'\\src\\HomeWork3\\resource\\report.txt");
        for (int i = 0; i < financial_records.length; i++) {
            financial_records[i] = new Financial_record(random.nextInt(10000), random.nextInt(10000));
            String data = String.join(";",
                    String.valueOf(financial_records[i].getIncomes()),
                    String.valueOf(financial_records[i].getOutcomes()));
            fileWriter.write(data + "\n");
        }
        fileWriter.close();
        FileReader fileReader1 = new FileReader("C:\\Users\\skidrow\\IdeaProjects\\lesson1'\\src\\HomeWork3\\resource\\report.txt");
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        while (bufferedReader1.ready()){
            String data = bufferedReader1.readLine();
            String[] dataMassive = data.split(";");
            incomes  += Integer.parseInt(dataMassive[0]);
            outcomes += Integer.parseInt(dataMassive[1]);
        }
        fileReader1.close();
        System.out.println("Общие доходы " + incomes + ", общие расходы " + outcomes);
    }

}
