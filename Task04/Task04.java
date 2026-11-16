
class ParkingTicket {
    int ticketNo;
    String vehicleNo;
    String entryTime;

    ParkingTicket() {
        this(1001, "Not Assigned", "Not Recorded");
    }

    ParkingTicket(int ticketNo, String vehicleNo) {
        this(ticketNo, vehicleNo, "Not Recorded");
    }

    ParkingTicket(int ticketNo, String vehicleNo, String entryTime) {
        this.ticketNo = ticketNo;
        this.vehicleNo = vehicleNo;
        this.entryTime = entryTime;
    }

    ParkingTicket(ParkingTicket other) {
        this(other.ticketNo, other.vehicleNo, other.entryTime);
    }

    void display() {
        System.out.println("Ticket Number: " + ticketNo);
        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println("Entry Time: " + entryTime);
        System.out.println();
    }
}

public class Task04 {
    public static void main(String[] args) {
        ParkingTicket t1 = new ParkingTicket();
        ParkingTicket t2 = new ParkingTicket(1002, "TN01AB1234");
        ParkingTicket t3 = new ParkingTicket(
            1003, "TN02CD5678", "10:30 AM"
        );
        ParkingTicket t4 = new ParkingTicket(t3);

        t1.display();
        t2.display();
        t3.display();
        t4.display();
    }
}
