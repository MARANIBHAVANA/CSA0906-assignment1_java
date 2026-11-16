# Task 11 – Implementation, Testing and Defence

## Aim
Implement and test a small working parking model.

## Features
- Allocates the first free slot.
- Rejects duplicate vehicle registrations.
- Calculates fees by vehicle category.
- Releases the slot when the vehicle exits.
- Stores active tickets in a HashMap keyed by registration number.

## Test cases
| Test | Input/action | Expected result |
|---|---|---|
| Normal car | Car parks for 2 hours | Fee Rs 60 |
| Two-wheeler | Bike parks for 2 hours | Fee Rs 20 |
| Zero minutes | Car parks for 0 minutes | Fee Rs 0 |
| Duplicate registration | Enter same registration twice | Rejected |
| Invalid slot | Release invalid position | Rejected |
| Full parking | Allocate after all slots are occupied | No slot available |

## Hand calculation
A car for 2 hours = Rs 60. A two-wheeler for 2 hours = Rs 20. Total collection = Rs 80.

## Data structure comparison
- Array: searching an active ticket is O(n).
- ArrayList: searching by registration is O(n).
- HashMap: average lookup by registration is O(1).
All store n tickets using O(n) space.

## Design defence
The model uses encapsulation through private fields, inheritance through vehicle subclasses, polymorphism through overridden fee methods, and abstraction through an abstract Vehicle class. A limitation is that this demonstration uses a simple fixed slot map and does not persist records to a database.
