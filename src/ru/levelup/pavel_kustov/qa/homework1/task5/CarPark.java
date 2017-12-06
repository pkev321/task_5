package ru.levelup.pavel_kustov.qa.homework1.task5;

import ru.levelup.pavel_kustov.qa.homework1.task5.entities.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarPark {

    ITransport[] transport = new ITransport[]{
            new ElectricTransport("tram1", 20, 30, "У123УК","32", Constans.Type.tram, 200000, 3200, 380 ),
            new GasolineTransport("bus1", 70, 1500, "У153УК", "23", Constans.Type.bus, 3225910, 100, 40 ),
            new ElectricTransport("trolleybus1", 20, 30, "У143УК","31", Constans.Type.trolleybus, 200000, 3200, 380 ),
            new ElectricTransport("tram3", 20, 30, "У115УК","35", Constans.Type.tram, 2002000, 3200, 380 ),
            new GasolineTransport("taxi1", 20, 1500, "У631УК", "12", Constans.Type.taxi, 322210, 100, 10 ),

            new GasolineTransport("bus2", 46, 1500, "У653УК", "29", Constans.Type.bus, 3222210, 100, 40 )
    };

    public static void main(String[] args) {
        CarPark carPark = new CarPark();
        carPark.startApp();
    }

    public void startApp() {
        double summ = 0;

        System.out.println("Состав общественного транспорта:");

        for (ITransport tr: transport ) {
            System.out.printf("Транспортное средство %s с государственным номером %s, с рыночной стоимостью %,.2f попугаев. \n" ,tr.getName(), tr.getNumberGos(), tr.getCost());
            summ += tr.getCost();
        }
        System.out.printf("Общая стоимость автотранспорта: %,.2f", summ);

        System.out.println("");

        System.out.println("Массив техники:");
        printArr(transport);

        System.out.println("");

        System.out.println("Массив техники c сортировкой по потреблению топлива:");
        sortByExpense(transport);
        printArr(transport);

        int minCapacity = 40;
        int maxCapacity = 80;
        System.out.printf("Найти автобус с вместимостью %d - %d человек. \n", minCapacity, maxCapacity);
        findByTypeAndCapacity(Constans.Type.bus, minCapacity, maxCapacity, transport);

    }

    private void findByTypeAndCapacity (Constans.Type type, int minCapacity, int maxCapacity, ITransport[] vArr) {
        int count = 0;
        for (ITransport tr : vArr) {
            if (tr.getType().equals(type) &&  (tr.getCapacity() >= minCapacity) && (tr.getCapacity() <= maxCapacity)) {
                System.out.println(tr.getName());
                count++;
            }
        }
        if (count == 0)
            System.out.println("Нет техники удовлетворяещей запросу");

    }

    private void printArr(ITransport[] vArr) {
        for (ITransport tr : vArr) {
            System.out.println(tr.getName());
        }
    }

    private void sortByExpense(ITransport[] vArr) {
        for (int i = vArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (vArr[j].getExpense() > vArr[j+1].getExpense()) {
                    ITransport tempIT = vArr[j];
                    vArr[j] = vArr[j+1];
                    vArr[j+1] = tempIT;
                }
            }
        }
    }

    /*
    private void setup() {
        ElectricTransport et = new ElectricTransport("123", 20, 30, "123fff23","32", Constans.Type.tram, 200000, 3200, 380 );
        transport.add(et);
        et = new ElectricTransport("123", 20, 30, "123fff23","32", Constans.Type.tram, 200000, 3200, 380 );
        transport.add(et);
        et = new ElectricTransport("123", 20, 30, "123fff23","32", Constans.Type.tram, 2002000, 3200, 380 );
        transport.add(et);
        et = new ElectricTransport("123", 20, 30, "123fff23","32", Constans.Type.tram, 2030000, 3200, 380 );
        transport.add(et);
        et = new ElectricTransport("123", 20, 30, "123fff23","32", Constans.Type.tram, 2004000, 3200, 380 );
        transport.add(et);
        et = new ElectricTransport("123", 20, 30, "123fff23","32", Constans.Type.tram, 2005000, 3200, 380 );
        transport.add(et);

        GasolineTransport gt = new GasolineTransport("321", 60, 1500, "e2321dfd", "23", Constans.Type.bus, 3222210, 100, 40 );
        transport.add(gt);
        gt = new GasolineTransport("321", 60, 1500, "e2321dfd", "23", Constans.Type.bus, 3222210, 100, 40 );
        transport.add(gt);
        gt = new GasolineTransport("321", 60, 1500, "e2321dfd", "23", Constans.Type.bus, 3222210, 100, 40 );
        transport.add(gt);
        gt = new GasolineTransport("321", 60, 1500, "e2321dfd", "23", Constans.Type.bus, 3222210, 100, 40 );
        transport.add(gt);
        gt = new GasolineTransport("321", 60, 1500, "e2321dfd", "23", Constans.Type.bus, 3222210, 100, 40 );
        transport.add(gt);
        gt = new GasolineTransport("321", 60, 1500, "e2321dfd", "23", Constans.Type.bus, 3222210, 100, 40 );
        transport.add(gt);

    } */
}
