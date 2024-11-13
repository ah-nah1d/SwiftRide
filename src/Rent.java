import java.time.LocalDate;
public class Rent {
    private  Car car;
    private  Customer customer;
    private  LocalDate rentalDate;
    private  int rentalDuration;

    public Rent(Car car,Customer customer, LocalDate rentalDate, int rentalDuration){
        this.car=car;
        this.customer=customer;
        this.rentalDate=rentalDate;
        this.rentalDuration=rentalDuration;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }
}
