# Task 12 – Day-4 Design Challenge

## Changed requirements
- Add e-bikes with a flat parking fee.
- Add delivery vans charged at double the car rate between 9 AM and 5 PM.
- Allow visitors to use a one-day pass.
- Extend the facility to five floors with different slot counts.

## A. Impact analysis
New vehicle categories and pricing rules are added. The vehicle hierarchy, pricing logic and pass validation are affected. Different slot counts require a jagged array rather than assuming every floor has the same number of slots.

## B. Evaluate original design
A subclass per vehicle category is extensible, but time-based pricing should be kept in a pricing rule rather than scattered across unrelated classes. The slot structure must support different floor sizes.

## C. Adaptation
Use an abstract Vehicle class, subclasses for Bike, Car, ElectricCar, EBike and DeliveryVan, a Pass interface, and a jagged slot array. A one-day pass is validated separately. DeliveryVan applies double the car rate during the specified time window.

## D. Defence
The revised design adds new subclasses and a pass type while keeping the slot allocator reusable. It is easier to add another vehicle subclass. The trade-off is a few more classes and a more explicit pricing policy.

## Test results
- E-bike flat fee: Rs 25.
- Delivery van at 10 AM for 2 hours: Rs 120 (double car rate of Rs 30/hour).
- Valid one-day pass: Rs 0.
- Jagged floors: 2, 3 and 1 slots are allocated correctly.
