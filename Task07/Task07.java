class Vehicle {
    private final String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    String getRegNo() {
        return regNo;
    }

    double calculateFee(int hours) {
        return 0;
    }

    @Override
    public String toString() {
        return "Vehicle: " + regNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) obj;
        return regNo.equals(other.regNo);
    }

    @Override
    public int hashCode() {
        return regNo.hashCode();
    }
}

class TwoWheeler extends Vehicle {
    TwoWheeler(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int hours) {
        return hours * 10;
    }
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

public class Task07 {
    public static void main(String[] args) {
        Vehicle bike = new TwoWheeler("TN01A1");
        Vehicle car = new Car("TN02B2");

        System.out.println(bike + " Fee: Rs " + bike.calculateFee(2));
        System.out.println(car + " Fee: Rs " + car.calculateFee(2));
        System.out.println(new Car("TN02B2").equals(car));
    }
}
