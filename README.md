# Project: Bank Account System

This project implements a bank account system in Java that includes two types of accounts: Savings Account and Checking Account. The system allows you to deposit money, withdraw money, calculate monthly interest and generate a monthly statement, with specific features for each type of account.

# Project Structure

The project is made up of the following classes:

# ***Account:*** 

Base class that models a bank account with the following attributes and functionalities:

Attributes: balance, numConsignaciones, numRetiros, tasaAnual, comMensual.

# ***Savings account:*** 

Account child class, which adds savings account behavior:

Attributes: active (determines if the account is active based on the balance).


 # ***Current account:***

 Account child class, which adds the behavior of a checking account:

Attributes: overdraft (allows the account balance to be negative).


# UML diagram

You can find the UML diagram of the system at the following link:

# Test Coverage

The project includes unit tests that ensure a minimum of 70% coverage, to validate the correct functioning of the main functionalities:

# Instructions to Execute the Project

1. **Clone the repository**
```bash
git clone : https://github.com/Snysic/Cuenta_Bancaria.git
```
2. **Set up the project in the IDE**
    - Open the project in your preferred IDE.
    - Ensure the JDK is configured correctly.
    - Verify the `pom.xml` file is present, as well as the dependencies.

3. **Run the application**
    - Navigate to the `App` class in your IDE.
    - Run the `App` class from the IDE, or from the terminal.
  
 ## Author

Maria V [![Snysic](https://img.icons8.com/ios-glyphs/30/000000/github.png)](https://github.com/Snysic)


## Disclaimer

This project is developed as part of the Factoría F5 bootcamp for educational purposes only. It is not intended for commercial use. All trademarks and third-party references belong to their respective owners.