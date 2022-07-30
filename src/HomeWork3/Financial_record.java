package HomeWork3;

import java.io.FileWriter;
import java.io.IOException;

public class Financial_record {
    public static void main(String[] args) throws IOException {
        Financial_record money = new Financial_record(500,300);
        FileWriter report = new FileWriter("C:\\Users\\skidrow\\IdeaProjects\\lesson1'\\src\\HomeWork3\\resource\\report.txt");
        String fileWriter = String.join(";",
                String.valueOf("Денег заработано: " + money.getIncomes()),
                String.valueOf("\nДенег потрачено: " + money.getOutcomes()));
        report.write(fileWriter + ";" + "\n");
        report.close();
    }

    private int incomes;
    private int outcomes;
    public Financial_record(int incomes, int outcomes){
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;

    }
    //Задача №3
    //Необходимо:
    // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
    // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
    // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
    // 4. Записать в файл "report.txt" данные из объекта класса.
    // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300
}
