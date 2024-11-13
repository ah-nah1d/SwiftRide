import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class CarRentService {
    private List<Car> cars;
    private List<Rent> rents;

    public CarRentService(List<Car> cars, List<Rent> rents) {
        this.cars = cars;
        this.rents = rents;
    }
    public void addCar(Car car){
        cars.add(car);
    }
    public List<Car> getAvailableCars(){
        List<Car> availableCars=new ArrayList<>();
        for (Car car:cars){
            if (car.isAvailable()){
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    public List<Car> getAllCars() {
        return cars;
    }
    public List<Rent> getRentalHistory() {
        return rents;
    }
    public boolean rentCar(String licensePlate, Customer customer,int duration){
        for (Car car:cars){
            if(car.getLicensePlate().equals(licensePlate)&& car.isAvailable()){
                car.setAvailability(false);
                rents.add(new Rent(car,customer, LocalDate.now(),duration));
                return  true;
            }
        }
        return false;
    }
    public void returnCar(String licensePlate){
        rents.removeIf(rental->{
            if(rental.getCar().getLicensePlate().equals(licensePlate)){
                rental.getCar().setAvailability(true);
                return true;
            }
            return false;
        });
    }
}
