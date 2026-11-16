# Task 06 – Inheritance Hierarchy

## Aim
Create an inheritance hierarchy for parking vehicles.

## Design
- `Vehicle` is the superclass.
- `TwoWheeler` and `Car` inherit from `Vehicle` (hierarchical inheritance).
- `ElectricCar` extends `Car` (multilevel inheritance).
- Common registration data is stored in `Vehicle`.
- Each subclass supplies its own hourly rate.

## Use of super
`super(regNo)` calls the parent constructor. The constructor order for an ElectricCar is:
Vehicle → Car → ElectricCar.

## UML
Vehicle
├── TwoWheeler
└── Car
    └── ElectricCar

## Alternative: Composition
A single Vehicle could contain a VehicleType object holding the rate. Composition makes adding types flexible, while inheritance gives each type its own class. Fee lookup is O(1) in both designs. Inheritance stores normal object fields; composition adds a reference to VehicleType.

## Result
The program demonstrates hierarchical and multilevel inheritance and prints the constructor execution order.
