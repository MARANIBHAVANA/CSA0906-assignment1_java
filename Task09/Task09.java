interface Chargeable {
    double chargingFee(int units);

    default void showChargingMessage() {
        System.out.println("Charging facility available");
    }

    static boolean validUnits(int units) {
        return units >= 0;
    }
}

abstract class Vehicle {
    private final String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    String getRegNo() {
        return regNo;
    }

    abstract double calculateFee(int hours);
}

class Car extends Vehicle {
    Car(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int hours) {
        return hours * 30;
    }
}

class ElectricCar extends Vehicle implements Chargeable {
    ElectricCar(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int hours) {
        return hours * 30;
    }

    @Override
    public double chargingFee(int units) {
        if (!Chargeable.validUnits(units)) return 0;
        return units * 12;
    }
}

public class Task09 {
    public static void main(String[] args) {
        Vehicle car = new Car("TN01A1");
        ElectricCar ev = new ElectricCar("TN02B2");

        System.out.println("Car fee: Rs " + car.calculateFee(2));
        System.out.println("EV parking fee: Rs " + ev.calculateFee(2));
        ev.showChargingMessage();
        System.out.println("Charging fee: Rs " + ev.chargingFee(5));
    }
}
