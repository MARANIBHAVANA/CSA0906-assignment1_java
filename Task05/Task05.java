
class ParkingTicket {
    static int ticketCounter;

    int ticketNumber;
    String vehicleNumber;
    String facilityName;

    static {
        ticketCounter = 1000;
    }

    ParkingTicket(String vehicleNumber, String facilityName) {
        ticketCounter++;
        this.ticketNumber = ticketCounter;
        this.vehicleNumber = vehicleNumber;
        this.facilityName = facilityName;
    }

    static int getTotalTickets() {
        return ticketCounter - 1000;
    }

    void display() {
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Facility: " + facilityName);
        System.out.println();
    }
}

class ParkingFacility {
    String name;

    ParkingFacility(String name) {
        this.name = name;
    }

    ParkingTicket createTicket(String vehicleNumber) {
        return new ParkingTicket(vehicleNumber, name);
    }
}

public class Task05 {
    public static void main(String[] args) {
        ParkingFacility north = new ParkingFacility("North Gate");
        ParkingFacility south = new ParkingFacility("South Gate");

        ParkingTicket t1 = north.createTicket("TN01AB1234");
        ParkingTicket t2 = south.createTicket("TN02CD5678");
        ParkingTicket t3 = north.createTicket("TN03EF9012");

        t1.display();
        t2.display();
        t3.display();

        System.out.println("Total Tickets: " +
                ParkingTicket.getTotalTickets());

        t2 = null;
        System.out.println("Ticket 2 is now eligible for garbage collection.");
    }
}
