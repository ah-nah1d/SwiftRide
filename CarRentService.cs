using System;
using System.Collections.Generic;

public class CarRentService
{
    private List<Car> cars = new List<Car>();
    private List<Rent> rentalHistory = new List<Rent>();

    public void AddCar(Car car)
    {
        cars.Add(car);
    }

    public List<Car> GetAvailableCars()
    {
        return cars.FindAll(car => car.IsAvailable);
    }

    public List<Rent> GetRentalHistory()
    {
        return rentalHistory;
    }

    public bool RentCar(string licensePlate, Customer customer, int duration)
    {
        Car car = cars.Find(c => c.LicensePlate == licensePlate);
        if (car != null && car.IsAvailable)
        {
            Rent rent = new Rent(car, customer, DateTime.Now, duration);
            rentalHistory.Add(rent);
            car.IsAvailable=false;
            return true;
        }
        return false;
    }

    public void ReturnCar(string licensePlate)
    {
        Car car = cars.Find(c => c.LicensePlate == licensePlate);
        if (car != null)
        {
            car.IsAvailable=true;
        }
    }

    public List<Car> GetAllCars()
    {
        return cars;
    }
}
