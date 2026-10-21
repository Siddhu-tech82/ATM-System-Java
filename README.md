# ATM System (Java)

A simple Java-based ATM Management System built using core Java concepts like classes, objects, interfaces, and collections. This project simulates common ATM operations such as checking balance, depositing, withdrawing, changing PIN, and viewing transaction history.

## Features

- Secure login with account number and PIN
- Check current account balance
- Deposit money into the account
- Withdraw money with validation for minimum denomination and sufficient funds
- Change ATM PIN
- View transaction history
- Preloaded sample users for demo testing

## Project Structure

```text
ATM-System-Java/
├── projects/
│   └── src/
│       └── com/
│           └── vcube/
│               └── projects/
│                   ├── AtmInterface.java
│                   ├── AtmMainClass.java
│                   ├── AtmSystem.java
│                   └── User.java
└── README.md
```

## Technologies Used

- Java
- Scanner for user input
- Object-oriented programming

## Demo User Accounts

The system contains these sample users:

| Account Number | Name     | PIN   | Balance |
|----------------|----------|-------|---------|
| 8850           | Siddhu   | 2123  | ₹8000   |
| 2212           | Bharath  | 3344  | ₹58000  |
| 1234           | Arun     | 2345  | ₹9000   |
| 2381           | Rohith   | 2004  | ₹6000   |

## How to Run

1. Open the project in any Java IDE or terminal.
2. Navigate to the source folder:

```bash
cd projects/src
```

3. Compile the Java files:

```bash
javac com/vcube/projects/*.java
```

4. Run the application:

```bash
java com.vcube.projects.AtmMainClass
```

## Example Workflow

- Enter your account number and PIN
- Choose an action from the menu:
  - 1. Check Balance
  - 2. Deposit
  - 3. Withdraw
  - 4. Change PIN
  - 5. Transaction History
  - 6. Exit

## Notes

- Withdrawal amount must be a multiple of 100.
- PIN must be a 4-digit number.
- Invalid credentials allow only three attempts before the account is blocked.

## License

This project is for educational and learning purposes.

## Author

Siddhu-tech82
