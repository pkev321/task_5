package ru.levelup.pavel_kustov.qa.homework1.task5;

import ru.levelup.pavel_kustov.qa.homework1.task5.entities.*;

/**
 * Класс реализующий домашнее задание №5
 * Вариант домашнего задания с парком общественного транспорта
 *  - создание иерархии
 *  - подсчет стоимости
 *  - сортировка по параметру
 *  - сортировка по диапазону
 *
 *  @version 1.0
 *  @author Kustov Pavel
 */

public class CarPark {

    /**
     * Инициализация массива элементов с интерфейсом ITransport различными классами реализующими этот интерфейс
     */
    ITransport[] transport = new ITransport[]{
            new ElectricTransport("tram1", 60, 10000, "У123УК","32", Constans.Type.tram, 200000, 3200, 380 ),
            new GasolineTransport("bus1", 70, 5000, "У153УК", "23", Constans.Type.bus, 3225910, 100, 40 ),
            new ElectricTransport("trolleybus1", 20, 5000, "У143УК","31", Constans.Type.trolleybus, 200000, 3200, 380 ),
            new ElectricTransport("tram3", 20, 10000, "У115УК","35", Constans.Type.tram, 2002000, 3200, 380 ),
            new GasolineTransport("taxi1", 20, 1500, "У631УК", "12", Constans.Type.taxi, 322210, 40, 10 ),
            new GasolineTransport("minibus1", 15, 2000, "У631ПР", "558", Constans.Type.minibus, 2355006, 60, 15 ),
            new GasolineTransport("bus2", 46, 5000, "У653УК", "29", Constans.Type.bus, 3222210, 100, 40 )
    };

    /**
     * Точка входа
     * @param args
     */
    public static void main(String[] args) {
        CarPark carPark = new CarPark();
        carPark.startApp();
    }

    /**
     * Освновная функция
     */
    public void startApp() {
        double summ = 0;

        System.out.println("Состав общественного транспорта:");

        for (ITransport tr: transport ) {
            System.out.printf("Транспортное средство %s с государственным номером %s, с рыночной стоимостью %,.2f попугаев. \n" ,tr.getName(), tr.getNumberGos(), tr.getCost());
            summ += tr.getCost();
        }
        System.out.printf("Общая стоимость автотранспорта: %,.2f", summ);
        System.out.println("");

        System.out.println("");

        System.out.println("Массив техники:");
        printArr(transport);

        System.out.println("");

        System.out.println("Массив техники c сортировкой по потреблению топлива:");
        sortByExpense(transport);
        printArr(transport);

        System.out.println("");

        int minCapacity = 40;
        int maxCapacity = 80;
        System.out.printf("Найти автобус с вместимостью %d - %d человек. \n", minCapacity, maxCapacity);
        findByTypeAndCapacity(Constans.Type.bus, minCapacity, maxCapacity, transport);
    }

    /**
     * Поиск элементов удовлетворяющих критериям и печать их имен
     * @param type Тип техники
     * @param minCapacity Минимальная вместимость
     * @param maxCapacity Максимальная вместимость
     * @param array массив элементов с интерфейсом ITransport
     */
    private void findByTypeAndCapacity (Constans.Type type, int minCapacity, int maxCapacity, ITransport[] array) {
        int count = 0;
        for (ITransport tr : array) {
            if (tr.getType().equals(type) &&  (tr.getCapacity() >= minCapacity) && (tr.getCapacity() <= maxCapacity)) {
                System.out.println(tr.getName());
                count++;
            }
        }
        if (count == 0)
            System.out.println("Нет техники удовлетворяещей запросу");
    }

    /**
     * Печать имён элементов массива
     * @param array
     */
    private void printArr(ITransport[] array) {
        for (ITransport tr : array) {
            System.out.println(tr.getName());
        }
    }

    /**
     * Сортировка по расходу топлива
     * @param array массив элементов с интерфейсом ITransport
     */
    private void sortByExpense(ITransport[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].getExpense() > array[j+1].getExpense()) {
                    ITransport tempIT = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tempIT;
                }
            }
        }
    }

}
