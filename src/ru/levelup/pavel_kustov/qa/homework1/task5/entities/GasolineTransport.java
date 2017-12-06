package ru.levelup.pavel_kustov.qa.homework1.task5.entities;

public class GasolineTransport extends Transport implements ITransport {

    private double volumeTank;
    private  double expensePer100;

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

    public double getExpensePer100() {
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
