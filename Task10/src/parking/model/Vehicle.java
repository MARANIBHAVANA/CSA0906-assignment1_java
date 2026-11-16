package parking.model;

public class Vehicle {
    private final String regNo;
    private int durationMinutes;

    public Vehicle(String regNo) {
        if (regNo == null || regNo.trim().isEmpty()) {
            throw new IllegalArgumentException("Registration number cannot be blank");
        }
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        if (durationMinutes < 0) {
            throw new IllegalArgumentException("Duration cannot be negative");
        }
        this.durationMinutes = durationMinutes;
    }
}
