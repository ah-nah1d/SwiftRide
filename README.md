🏎️ Project Overview
--------------------

Welcome to the **Car Rental System**, a simple yet powerful console application built in Java that allows users to view available cars, rent a car, return a car, and view rental history. This system is designed with **Object-Oriented Programming (OOP)** principles, featuring classes like `Car`, `Customer`, `Rent`, and `CarRentService` to manage the car rental process effectively.

This project is perfect for practicing OOP concepts like **encapsulation**, **inheritance**, **polymorphism**, and **abstraction**.

🚀 Features
-----------

-   **View Available Cars**: See a list of available cars with details like model and license plate.
-   **Rent a Car**: Rent an available car by selecting it via its ID and specifying rental duration.
-   **Return a Car**: Easily return a rented car by entering its license plate.
-   **Rental History**: View a history of all rentals, including customer details, car information, and rental dates.
-   **List All Cars**: View all cars in the system along with their availability status (Available/Rented).

📦 Prerequisites
----------------

Before you begin, ensure you have the following installed on your local machine:

-   **Java 8** or higher
-   **IDE** (IntelliJ IDEA, Eclipse, etc.) or command-line setup

🛠️ Installation & Setup
------------------------

1.  **Clone the Repository**: Open your terminal and run the following command:
   
    `git clone https://github.com/yourusername/car-rental-system.git
    cd car-rental-system`

3.  **Compile and Run the Project**:

    -   Open the project in your IDE or compile it using the command line.
    -   To compile the project, use:

       `javac Main.java`

    -   To run the project:

       `java Main`

    This will start the car rental system in the terminal.

🔧 Usage
--------

Once you've successfully set up the system, you can interact with it via the command line. The following options are available in the main menu:

1.  **View Available Cars**: Displays a list of available cars with IDs, allowing you to rent a car.
2.  **Return a Car**: Allows you to return a rented car by entering its license plate.
3.  **View Rental History**: See a list of all past rentals, including customer names, rented car details, and rental durations.
4.  **List All Cars**: Shows all cars in the system, including those that are currently rented.
5.  **Exit**: Exit the application.

### Example:

`1. View available cars
2. Return a car
3. View rental history
4. List all cars
5. Exit
Choose an option: 1

Available Cars:
1. Toyota Corolla - ABC123
2. Honda Civic - XYZ789
3. Ford Mustang - JKL456
Enter the ID of the car you want to rent: 1
Enter your name: John Doe
Enter your license number: DL123456
Enter rental duration (days): 5
Car rented successfully.`

📚 Project Structure
--------------------

The project consists of the following main files:


`.

├── Car.java              # Class representing a car object

├── CarRentService.java   # Class managing car rentals and available cars

├── Customer.java         # Class representing a customer

├── Main.java             # Main class to run the system

├── Rent.java             # Class representing a rental transaction

├── ConsoleUtils.java     # Utility class for clearing screen, printing banner

└── README.md             # Project documentation`

💡 Key OOP Concepts Used
------------------------

-   **Encapsulation**: Each class has private fields, and public getter/setter methods are used to access and modify them.
-   **Abstraction**: The system abstracts the user interface from the car rental logic, separating concerns.
-   **Inheritance**: (Optional, for further improvement) Could be used for extending car types (e.g., Sedan, SUV, etc.)
-   **Polymorphism**: Methods in `CarRentService` can handle different objects (`Car` and `Customer`) seamlessly.

📝 Future Improvements
----------------------

-   **Extend the Car Types**: Add different car types like SUV, Sedan, etc., using inheritance.
-   **Database Integration**: Instead of storing rental data in memory, use a database to persist customer and rental details.
-   **GUI Version**: Create a graphical user interface (GUI) for a more user-friendly experience.

🤝 Contributing
---------------

Feel free to fork this project, make improvements, or open issues for any bugs or feature requests. Contributions are welcome!

1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature-name`).
3.  Commit your changes (`git commit -m 'Add new feature'`).
4.  Push to the branch (`git push origin feature-name`).
5.  Open a pull request.

📄 License
----------

This project is open-source and available under the [MIT License](LICENSE).



* * * * *

> "Rent your car, drive with ease!" 🚗
