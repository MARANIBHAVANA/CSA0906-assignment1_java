interface Pass {
    boolean isValid();
}

class OneDayPass implements Pass {
    private final boolean valid;

    OneDayPass(boolean valid) {
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
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

    abstract double calculateFee(int hours, int entryHour);
}

class Bike extends Vehicle {
    Bike(String r) { super(r); }
    double calculateFee(int h, int t) { return h * 10; }
}

class Car extends Vehicle {
    Car(String r) { super(r); }
    double calculateFee(int h, int t) { return h * 30; }
}

class ElectricCar extends Car {
    ElectricCar(String r) { super(r); }
}

class EBike extends Vehicle {
    EBike(String r) { super(r); }
    double calculateFee(int h, int t) { return 25; }
}

class DeliveryVan extends Vehicle {
    DeliveryVan(String r) { super(r); }

    double calculateFee(int h, int entryHour) {
        double carRate = 30;
        boolean daytime = entryHour >= 9 && entryHour < 17;
        return h * carRate * (daytime ? 2 : 1);
    }
}

class ParkingFacility {
    private final String[][] slots;

    ParkingFacility(int[] sizes) {
        slots = new String[sizes.length][];
        for (int i = 0; i < sizes.length; i++) {
            slots[i] = new String[sizes[i]];
        }
    }

    boolean allocate(String regNo) {
        for (int f = 0; f < slots.length; f++) {
            for (int s = 0; s < slots[f].length; s++) {
                if (slots[f][s] == null) {
                    slots[f][s] = regNo;
                    return true;
                }
            }
        }
        return false;
    }
}

public class Task12 {
    static double finalFee(Vehicle v, int hours, int entryHour, Pass pass) {
        if (pass != null && pass.isValid()) return 0;
        return v.calculateFee(hours, entryHour);
    }

    public static void main(String[] args) {
        ParkingFacility facility = new ParkingFacility(new int[]{2, 3, 1, 2, 2});
        System.out.println("E-bike fee: Rs "
                + finalFee(new EBike("EB01"), 2, 10, null));
        System.out.println("Delivery van fee: Rs "
                + finalFee(new DeliveryVan("DV01"), 2, 10, null));
        System.out.println("One-day pass fee: Rs "
                + finalFee(new Car("TN01AB1234"), 2, 10, new OneDayPass(true)));
        System.out.println("Slot allocated: " + facility.allocate("EB01"));
    }
}
