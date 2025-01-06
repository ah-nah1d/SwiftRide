
using System;
using System.Collections.Generic;

public class Program
{
    public static void Main(string[] args)
    {
        CarRentService rentalService = new CarRentService();
        rentalService.AddCar(new Car("ABC123", "Toyota Corolla"));
        rentalService.AddCar(new Car("XYZ789", "Honda Civic"));
        rentalService.AddCar(new Car("JKL456", "Ford Mustang"));

        while (true)
        {
            ConsoleUtils.ClearScreen();
            ConsoleUtils.PrintBanner();
            Console.WriteLine("1. View available cars");
            Console.WriteLine("2. Return a car");
            Console.WriteLine("3. View rental history");
            Console.WriteLine("4. List all cars");
            Console.WriteLine("5. Exit");
            ConsoleUtils.PrintSeparator();
            Console.Write("Choose an option: ");
            int choice = int.Parse(Console.ReadLine());

            ConsoleUtils.ClearScreen();

            switch (choice)
            {
                case 1:
                    ConsoleUtils.PrintBanner();
                    Console.WriteLine("Available Cars:");
                    int id = 1;
                    foreach (var car in rentalService.GetAvailableCars())
                    {
                        Console.WriteLine($"{id}. {car.Model} - {car.LicensePlate}");
                        id++;
                    }

                    if (rentalService.GetAvailableCars().Count > 0)
                    {
                        Console.Write("Enter the ID of the car you want to rent: ");
                        int carId = int.Parse(Console.ReadLine());

                        if (carId > 0 && carId <= rentalService.GetAvailableCars().Count)
                        {
                            Car selectedCar = rentalService.GetAvailableCars()[carId - 1];

                            Console.Write("Enter your name: ");
                            string name = Console.ReadLine();
                            Console.Write("Enter your license number: ");
                            string licenseNumber = Console.ReadLine();
                            Console.Write("Enter rental duration (days): ");
                            int duration = int.Parse(Console.ReadLine());

                            Customer customer = new Customer(name, licenseNumber);
                            if (rentalService.RentCar(selectedCar.LicensePlate, customer, duration))
                            {
                                Console.WriteLine("Car rented successfully.");
                            }
                            else
                            {
                                Console.WriteLine("Car is not available or invalid license plate.");
                            }
                        }
                        else
                        {
                            Console.WriteLine("Invalid car ID.");
                        }
                    }
                    else
                    {
                        Console.WriteLine("No cars available for rent.");
                    }
                    break;

                case 2:
                    Console.Write("Enter car license plate to return: ");
                    string returnPlate = Console.ReadLine();
                    rentalService.ReturnCar(returnPlate);
                    Console.WriteLine("Car returned successfully.");
                    break;

                case 3:
                    ConsoleUtils.PrintBanner();
                    Console.WriteLine("Rental History:");
                    foreach (var rental in rentalService.GetRentalHistory())
                    {
                        Console.WriteLine($"{rental.Customer.Name} rented {rental.Car.Model} (Plate: {rental.Car.LicensePlate}) on {rental.RentalDate.ToShortDateString()} for {rental.RentalDuration} days.");
                    }
                    break;

                case 4:
                    ConsoleUtils.PrintBanner();
                    Console.WriteLine("All Cars:");
                    foreach (var car in rentalService.GetAllCars())
                    {
                        string availability = car.IsAvailable ? "Available" : "Rented";
                        Console.WriteLine($"{car.Model} - {car.LicensePlate} ({availability})");
                    }
                    break;

                case 5:
                    Console.WriteLine("Exiting the system...");
                    return;

                default:
                    Console.WriteLine("Invalid choice. Try again.");
                    break;
            }

            Console.WriteLine("\nPress Enter to continue...");
            Console.ReadLine();
        }
    }
}
