package com.lits.hw5;

public class Bus extends Auto {


    // Конструктор Bus
    public Bus(String name, String model, int year, float weight, int maxspeed,
               int idEngine, String typeEngine, double powerEngine) {
        super(name, model, year, weight, maxspeed, idEngine, typeEngine, powerEngine);

    }

    @Override
    public void dataAuto() {
        System.out.println("Назва:" + name + " Модель:" + model + " Рік:" + year +
                " Вага:" + weight + " Макс швидкість:" + maxSpeed + " VIN:" + engine.getIdEngine() +
                " Тип двигуна:" + engine.getTypeEngine() + " Обʼєм двигуна:" + engine.getPowerEngine());
    }
}