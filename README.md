MarketQuotesApp
This is a simple Java application that allows users to retrieve the latest market quotes for various indices. The user can input the name of a market (either "dow", "ftse", or "nasdaq"), and the application will return the latest quote for that market.

Features
Retrieves latest quotes for Dow, FTSE, and Nasdaq.
Prompts the user to enter a market name.
Displays the market quote if the input is valid.
Provides a helpful message when the input is invalid.
Requirements
Java 8 or later installed on your system.
How to Run
Clone or download the repository to your local machine.
Open a terminal/command prompt.
Navigate to the project directory.
Compile the program using the following command:
bash
Copy
javac MarketQuotesApp.java
Run the application using the command:
bash
Copy
java MarketQuotesApp
When prompted, enter the market name (e.g., "dow", "ftse", or "nasdaq") to view the latest market quote.
Example Usage
bash
Copy
Enter market name (dow, ftse, nasdaq): dow
Latest Dow Quote: 34,000
If an invalid market name is entered:

bash
Copy
Enter market name (dow, ftse, nasdaq): sp500
Market not recognized. Please enter dow, ftse, or nasdaq.
License
This project is licensed under the MIT License.

