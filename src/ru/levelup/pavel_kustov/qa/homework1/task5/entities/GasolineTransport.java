package ru.levelup.pavel_kustov.qa.homework1.task5.entities;

/**
 * Класс описывающий бензиновый транспорт
 *  является наледником общего класса Transport
 *  релизует интерфейс ITransport
 *
 *  Отличается реализацией специфичных вопросов рахода топлива
 */
public class GasolineTransport extends Transport implements ITransport {

    private double volumeTank;      // емкость бака
    private  double expensePer100;  // расход топлива

    public GasolineTransport(String name, double capacity, double carrying, String numberGos, String numberRoute, Constans.Type type, double costTransport, double volumeTank, double expensePer100) {
        super(name, capacity, carrying, numberGos, numberRoute, Constans.DriveType.Petrol, type, costTransport);
        this.volumeTank = volumeTank;
        this.expensePer100 = expensePer100;
    }

    public double getVolumeTank() {
        return volumeTank;
    }

    public void setVolumeTank(double volumeTank) {
        this.volumeTank = volumeTank;
    }

    private double getExpensePer100() {
        return expensePer100;
    }

    public void setExpensePer100(double expensePer100) {
        this.expensePer100 = expensePer100;
    }

    @Override
    public double getCost() {
        return getCostTransport();
    }

    @Override
    public double getExpense() {
        return getExpensePer100();
    }
}
