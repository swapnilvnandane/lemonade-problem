# Lemonade Change Problem

## Overview

This is a Java application that determines if it is possible to provide the correct change for a series of lemonade transactions. The main logic is implemented in the `Main` class.

## Files

- `src/Main.java`: Contains the main logic for the application.

## How to Run

1. **Clone the repository**:
    ```sh
    git clone git@github.com:swapnilvnandane/lemonade-problem.git
    cd lemonade-problem
    ```

2. **Compile the Java code**:
    ```sh
    javac src/Main.java
    ```

3. **Run the application**:
    ```sh
    java -cp src Main
    ```

## Example

The application will print the results of two scenarios:

1. **Happy Path Scenario**:
    - Input: `[5, 5, 5, 10, 20]`
    - Output: `Answer to true`

2. **False Path Scenario**:
    - Input: `[5, 5, 10, 10, 20]`
    - Output: `Answer to false`

## Method Details

### `lemonadeChange`

- **Description**: Checks if the lemonade change can be given for a list of transactions.
- **Parameters**: `List<Integer> list` - A list of integers representing the transactions.
- **Returns**: `boolean` - `true` if change can be given for all transactions, `false` otherwise.

## License

This project is licensed under the MIT License.