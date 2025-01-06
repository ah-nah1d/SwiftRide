using System;

public class Rent
{
    public Car Car { get; }
    public Customer Customer { get; }
    public DateTime RentalDate { get; }
    public int RentalDuration { get; }

    public Rent(Car car, Customer customer, DateTime rentalDate, int rentalDuration)
    {
        Car = car;
        Customer = customer;
        RentalDate = rentalDate;
        RentalDuration = rentalDuration;
    }
}