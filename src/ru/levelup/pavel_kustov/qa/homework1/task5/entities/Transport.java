package ru.levelup.pavel_kustov.qa.homework1.task5.entities;

/**
 * Класс описывающий прородителя
 * обеспечивает описание основного функционала
 * любого транспортного средства парка общественного транспорта
 */
public class Transport {
    private String name;                    // имя
    private double capacity;                // вместимость
    private double carrying;                // грузоподъемность
    private String numberGos;               // государственный номер
    private String numberRoute;             // номер маршрута
    private Constans.DriveType driveType;   // тип двигателя
    private Constans.Type type;             // тип транспортного средства
    private double costTransport;           // стоимость

    public Transport(String name, double capacity, double carrying, String numberGos, String numberRoute, Constans.DriveType driveType, Constans.Type type, double costTransport) {
        this.name = name;
        this.capacity = capacity;
        this.carrying = carrying;
        this.numberGos = numberGos;
        this.numberRoute = numberRoute;
        this.driveType = driveType;
        this.type = type;
        this.costTransport = costTransport;
    }

    public double getCostTransport() {
        return costTransport;
    }

    public void setCostTransport(double costTransport) {
        this.costTransport = costTransport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    public String getNumberGos() {
        return numberGos;
    }

    public void setNumberGos(String numberGos) {
        this.numberGos = numberGos;
    }

    public String getNumberRoute() {
        return numberRoute;
    }

    public void setNumberRoute(String numberRoute) {
        this.numberRoute = numberRoute;
    }

    public Constans.DriveType getDriveType() {
        return driveType;
    }

    public void setDriveType(Constans.DriveType driveType) {
        this.driveType = driveType;
    }

    public Constans.Type getType() {
        return type;
    }

    public void setType(Constans.Type type) {
        this.type = type;
    }
}
