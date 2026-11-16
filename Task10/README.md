# Task 10 – Packages and Encapsulation

## Package structure
- `parking.model`: stores the Vehicle class.
- `parking.app`: contains the main application.

## Access modifiers
- `private`: protects fields from direct outside changes.
- `public`: allows safe methods to be called from other packages.
- Constructors and methods validate values before updating the object.

## Validation
The registration number cannot be blank. Parking duration cannot be negative.

## Wrapper classes and autoboxing
`Integer` is a wrapper class for `int`. Autoboxing converts an int to Integer. Use `equals()` to compare Integer values; `==` can compare object references instead of numeric values.

## Alternative: public fields
If fields were public, any class could set an invalid duration or blank registration number. Validation would be repeated in many places. A validating setter costs O(1) time per update and centralises the rule.

## Files
Create the following folders and files:
- `src/parking/model/Vehicle.java`
- `src/parking/app/Task10.java`

## Compile and run
From the Task10 folder:
`javac -d out src/parking/model/Vehicle.java src/parking/app/Task10.java`
`java -cp out parking.app.Task10`
