
# Task 03 – Design the Control Logic

## 1. Slot Allocation Logic

1. Start from the first floor.
2. Check every slot on that floor.
3. If a slot is empty, store the vehicle number.
4. Return the floor and slot position.
5. If no slot is available, return null.

## 2. Parking Fee Logic – Pseudocode

START
INPUT vehicle type, parking duration, user category and pass status

IF user is a student or staff member AND pass is valid
    fee = 0
ELSE
    IF duration <= 1 hour
        fee = first-hour rate
    ELSE
        fee = first-hour rate + additional-hour charges
    END IF
    Apply the daily maximum fee
END IF

DISPLAY fee
STOP

## 3. Slot Release Logic – Pseudocode

START
INPUT floor number and slot number

IF floor or slot position is invalid
    RETURN false
ELSE IF slot is already empty
    RETURN false
ELSE
    Clear the vehicle number
    RETURN true
END IF

STOP

## 4. Control Statements

- for loops check floors and slots.
- if-else checks slot availability and valid positions.
- break can stop unnecessary searching.
- continue can skip occupied slots.
- return sends the allocation result or release status.

## 5. Complexity Analysis

Let F be the number of floors and S be the maximum slots per floor.

- Allocation: O(F × S) worst case.
- Release: O(1).
- Space: O(F × S) for the parking array.

An alternative approach using a stack of free slots can make allocation and release O(1), with additional storage.

## 6. Conclusion

Loops and conditional statements help allocate and release parking slots correctly. The program returns null when the parking facility is full and false when a release request is invalid.
