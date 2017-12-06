package ru.levelup.pavel_kustov.qa.homework1.task5.entities;

public class ElectricTransport extends Transport implements ITransport {
    private double powerful;
    private double supplyVoltage;

    public ElectricTransport(String name, double capacity, double carrying, String numberGos, String numberRoute, Constans.Type type, double costTransport, double powerful, double supplyVoltage) {
        super(name, capacity, carrying, numberGos, numberRoute, Constans.DriveType.Electric, type, costTransport);

        this.powerful = powerful;
        this.supplyVoltage = supplyVoltage;

    }

    public double getPowerful() {
        return powerful;
    }

    public void setPowerful(double powerful) {
        this.powerful = powerful;
    }

    public double getSupplyVoltage() {
        return supplyVoltage;
    }

    public void setSupplyVoltage(double supplyVoltage) {
        this.supplyVoltage = supplyVoltage;
    }

    @Override
    public double getCost() {
        return getCostTransport();
    }

    @Override
    public double getExpense() {
        return 0;
    }
}
