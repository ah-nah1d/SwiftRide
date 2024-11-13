import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarRentService rentalService = new CarRentService();
        rentalService.addCar(new Car("ABC123", "Toyota Corolla"));
        rentalService.addCar(new Car("XYZ789", "Honda Civic"));
        rentalService.addCar(new Car("JKL456", "Ford Mustang"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            ConsoleUtils.clearScreen();
            ConsoleUtils.printBanner();
            System.out.println("1. View available cars");
            System.out.println("2. Return a car");
            System.out.println("3. View rental history");
            System.out.println("4. List all cars");
            System.out.println("5. Exit");
            ConsoleUtils.printSeparator();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            ConsoleUtils.clearScreen();

            switch (choice) {
                case 1:
                    ConsoleUtils.printBanner();
                    System.out.println("Available Cars:");
                    // Display available cars with an ID
                    int id = 1;
                    for (Car car : rentalService.getAvailableCars()) {
                        System.out.println(id + ". " + car.getModel() + " - " + car.getLicensePlate());
                        id++;
                    }

                    // Prompt the user to select a car by ID
                    if (!rentalService.getAvailableCars().isEmpty()) {
                        System.out.print("Enter the ID of the car you want to rent: ");
                        int carId = scanner.nextInt();

                        // Validate if the ID is valid
                        if (carId > 0 && carId <= rentalService.getAvailableCars().size()) {
                            Car selectedCar = rentalService.getAvailableCars().get(carId - 1);

                            // Ask for customer details and rental duration
                            scanner.nextLine(); // Consume newline
                            System.out.print("Enter your name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter your license number: ");
                            String licenseNumber = scanner.nextLine();
                            System.out.print("Enter rental duration (days): ");
                            int duration = scanner.nextInt();

                            Customer customer = new Customer(name, licenseNumber);
                            if (rentalService.rentCar(selectedCar.getLicensePlate(), customer, duration)) {
                                System.out.println("Car rented successfully.");
                            } else {
                                System.out.println("Car is not available or invalid license plate.");
                            }
                        } else {
                            System.out.println("Invalid car ID.");
                        }
                    } else {
                        System.out.println("No cars available for rent.");
                    }
                    break;

                case 2:
                    System.out.print("Enter car license plate to return: ");
                    scanner.nextLine(); // Consume newline
                    String returnPlate = scanner.nextLine();
                    rentalService.returnCar(returnPlate);
                    System.out.println("Car returned successfully.");
                    break;

                case 3:
                    ConsoleUtils.printBanner();
                    System.out.println("Rental History:");
                    for (Rent rental : rentalService.getRentalHistory()) {
                        System.out.println(rental.getCustomer().getName() + " rented " + rental.getCar().getModel() +
                                " (Plate: " + rental.getCar().getLicensePlate() + ") on " + rental.getRentalDate() +
                                " for " + rental.getRentalDuration() + " days.");
                    }
                    break;

                case 4:
                    ConsoleUtils.printBanner();
                    System.out.println("All Cars:");
                    for (Car car : rentalService.getAllCars()) {
                        String availability = car.isAvailable() ? "Available" : "Rented";
                        System.out.println(car.getModel() + " - " + car.getLicensePlate() + " (" + availability + ")");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
            scanner.nextLine(); // Wait for Enter key press
        }
    }
}
