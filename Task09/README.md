# Task 09 – Abstraction

## Aim
Use an abstract class and an interface to separate common structure from optional capabilities.

## Design
- `Vehicle` is abstract because a generic vehicle should not be created directly.
- `ratePerHour()` is abstract because each vehicle category supplies its own rate.
- `Chargeable` is an interface because only some vehicles support charging.
- A class can extend one class and implement multiple interfaces.
- A default interface method can provide shared behaviour; a static interface method can provide a utility method.

## Alternative
If Vehicle were an interface, it could not hold normal instance fields or constructors. If Chargeable became an abstract class, a vehicle could not extend both Vehicle and Chargeable because Java allows only one superclass. Method-call time is effectively O(1) in either design; object state and references determine memory use.

## Result
The program demonstrates abstract classes and interfaces.
