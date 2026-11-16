
# Task 04 – Design Classes, Objects and Constructors

## 1. Classes and Objects

The Campus Smart-Parking System uses the following classes:

- Vehicle – stores vehicle details.
- ParkingSlot – stores parking slot information.
- ParkingTicket – stores ticket number and entry time.
- ParkingUser – stores user details.
- ParkingFacility – manages parking slots.

## 2. Types of Constructors

- Default Constructor: Creates an object with default values.
- Parameterised Constructor: Initializes an object with given values.
- Overloaded Constructor: Allows objects to be created in different ways.
- Copy Constructor: Creates a new object using another object's values.

## 3. Use of this Keyword

The this keyword refers to the current object. It is used to distinguish instance variables from constructor parameters.

## 4. Constructor Chaining

Constructor chaining allows one constructor to call another constructor using this(). It avoids repeating initialization code.

## 5. Object Memory

- Reference variables are stored in stack memory.
- Objects are created in heap memory.
- Objects without active references become eligible for garbage collection.

## 6. Alternative Concepts

Default constructor followed by setter methods allows values to be assigned later, but an incomplete object may be created.

Static factory methods can control object creation and validate input before returning an object.

## 7. Complexity Analysis

Creating one ParkingTicket object takes O(1) time and O(1) space.

Creating n tickets takes O(n) total time and O(n) total space.

## 8. Conclusion

Constructors help initialize objects correctly. Constructor overloading and chaining improve code reuse and make object creation easier.
