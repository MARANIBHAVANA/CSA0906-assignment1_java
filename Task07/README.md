# Task 07 – Method Overriding

## Aim
Specialise vehicle behaviour using method overriding.

## Concepts
- Each vehicle subclass overrides `calculateFee()`.
- `@Override` helps the compiler detect an incorrect method signature.
- A final registration number cannot be reassigned.
- `toString()` gives readable vehicle details.
- `equals()` and `hashCode()` use registration number so equal vehicles have the same hash code.

## Alternative: switch statement
A single method with a switch on vehicle type can calculate fees, but every new type requires editing the switch. Overriding keeps the rate with the relevant subclass. Both calculate a fee in O(1) time; adding a type is easier with a new subclass.

## Result
The program demonstrates overridden fee calculation and Object class methods.
