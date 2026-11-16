package parking.app;

import parking.model.Vehicle;

public class Task10 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("TN01AB1234");
        v.setDurationMinutes(90);

        Integer a = 1000;
        Integer b = 1000;

        System.out.println("Registration: " + v.getRegNo());
        System.out.println("Duration: " + v.getDurationMinutes());
        System.out.println("Integer equals: " + a.equals(b));

        try {
            v.setDurationMinutes(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid duration rejected");
        }
    }
}
