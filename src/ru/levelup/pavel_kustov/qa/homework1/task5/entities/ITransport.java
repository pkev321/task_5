package ru.levelup.pavel_kustov.qa.homework1.task5.entities;

/**
 * Описание интерфейса ITransport
 *
 */
public interface ITransport {
    double getCost();               // получение стомости
    double getExpense();            // получение расхода топлива
    String getName();               // получение имени
    String getNumberGos();          // получение государственного номера
    Constans.Type getType();        // получение типа транспортного тредства (см. Constans.java)
    double getCapacity();           // получение вместимости транспортного средства
}
