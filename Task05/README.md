# Task 05 – Static Members and Object Life Cycle

## Aim
To demonstrate static variables, static methods, static blocks, and object life cycle in Java.

## Static Members
- `ticketCounter` is a static variable shared by all ParkingTicket objects.
- `generateTicketNumber()` is a static method used to generate unique ticket numbers.
- A static block initializes the ticket counter when the class loads.
- Static members belong to the class, not individual objects.

## Object Life Cycle
1. An object is created using the `new` keyword.
2. The object is used through its reference.
3. When no reference points to the object, it becomes eligible for garbage collection.
4. Java's garbage collector may remove unused objects automatically.

## Passing and Returning Objects
Objects can be passed as method arguments and returned from methods.

## North and South Parking Facilities
A static ticket counter generates unique ticket numbers even when tickets are created by two different facilities.

## Alternative Design
If the ticket counter were an instance variable, each facility would have its own counter. This could create duplicate ticket numbers. A static counter avoids this problem.

## Complexity
- Generating a ticket number: O(1) time.
- Static counter space: O(1), because only one shared counter exists.
- For k facilities, an instance counter would require O(k) counter storage.

## Conclusion
Static members help share common data and generate unique ticket numbers across multiple parking facilities.