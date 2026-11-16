import java.util.HashMap;
import java.util.Map;

abstract class Vehicle {
    private final String regNo;

    Vehicle(String regNo) {
        if (regNo == null || regNo.trim().isEmpty())
            throw new IllegalArgumentException("Invalid registration");
        this.regNo = regNo;
    }

    String getRegNo() { return regNo; }
    abstract double fee(int hours);
}

class Bike extends Vehicle {
    Bike(String regNo) { super(regNo); }
    @Override double fee(int hours) { return hours * 10; }
}

class Car extends Vehicle {
    Car(String regNo) { super(regNo); }
    @Override double fee(int hours) { return hours * 30; }
}

class ParkingSystem {
    private final String[] slots;
    private final Map<String, Vehicle> active = new HashMap<>();

    ParkingSystem(int slotCount) {
        slots = new String[slotCount];
    }

    int park(Vehicle v) {
        if (active.containsKey(v.getRegNo())) {
            System.out.println("Duplicate registration rejected");
            return -1;
        }

        for (int i = 0; i < slots.length; i++) {
            if (slots[i] == null) {
                slots[i] = v.getRegNo();
                active.put(v.getRegNo(), v);
                System.out.println(v.getRegNo() + " parked in slot " + (i + 1));
                return i;
            }
        }

        System.out.println("No slot available");
        return -1;
    }

    double exit(String regNo, int hours) {
        Vehicle v = active.remove(regNo);
        if (v == null) {
            System.out.println("Vehicle not found");
            return -1;
        }

        for (int i = 0; i < slots.length; i++) {
            if (regNo.equals(slots[i])) {
                slots[i] = null;
                break;
            }
        }

        double amount = v.fee(Math.max(0, hours));
        System.out.println(regNo + " parking fee: Rs " + amount);
        return amount;
    }

    boolean releaseInvalidSlot(int slot) {
        if (slot < 0 || slot >= slots.length) return false;
        slots[slot] = null;
        return true;
    }
}

public class Task11 {
    public static void main(String[] args) {
        ParkingSystem p = new ParkingSystem(2);

        p.park(new Car("TN01AB1234"));
        p.park(new Bike("TN02CD5678"));
        p.park(new Car("TN01AB1234"));

        double carFee = p.exit("TN01AB1234", 2);
        double bikeFee = p.exit("TN02CD5678", 2);

        System.out.println("Total collection: Rs " + (carFee + bikeFee));
        System.out.println("Invalid slot accepted: " + p.releaseInvalidSlot(5));
    }
}
