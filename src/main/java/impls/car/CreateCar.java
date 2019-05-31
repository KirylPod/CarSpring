package impls.car;

import interfaces.Car;
import interfaces.Engine;
import interfaces.Oil;
import interfaces.Transmission;
import org.springframework.context.annotation.Configuration;

@Configuration

public class CreateCar implements Car {

    private Oil oil;
    private Engine engine;
    private Transmission transmission;

    private String color;
    private int year;
    private boolean soundEnabled;

    public CreateCar(){
            }

    public CreateCar(Oil oil, Engine engine, Transmission transmission) {
        this.oil = oil;
        this.engine = engine;
        this.transmission = transmission;
    }

    public CreateCar(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public CreateCar(Oil oil, Engine engine, Transmission transmission, String color, int year, boolean soundEnabled) {
        this.oil = oil;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void go() {
        oil.refuel();
        engine.start();
        transmission.putGear();
        System.out.println("Цвет: " + color);
        System.out.println("Год выпуска: " + year);
        System.out.println("Выхлоп: " + soundEnabled);

    }

    @Override
    public void brake() {
        System.out.println("Торомози, стоит радар");
    }

    public Oil getOil() {
        return oil;
    }

    public void setOil(Oil oil) {
        this.oil = oil;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }
}
