# Task 08 – Polymorphism

## Aim
Demonstrate compile-time and runtime polymorphism.

## Concepts
- Method overloading: `calculateFee(int minutes)` and `calculateFee(LocalTime in, LocalTime out)`.
- Upcasting: a `Vehicle[]` stores TwoWheeler, Car and ElectricCar objects.
- Runtime dispatch calls the actual object's overridden `ratePerHour()`.
- This avoids long if-else chains checking every vehicle type.

## Dispatch trace
Declared reference type: Vehicle. Actual object: Car. Executed method: Car.ratePerHour().

## Alternative
Using repeated `instanceof` checks may require up to k type checks for k vehicle categories. Dynamic dispatch selects the override directly. Fee calculation remains O(1) for a fixed number of arithmetic operations.

## Result
The output demonstrates overloading, runtime polymorphism and charging capability.
