public class Customer {
    private final String name;
    private String licenseNumber;
    public Customer(String name,String licenseNumber){
        this.name=name;
        this.licenseNumber=licenseNumber;
    }
    public String getName(){
        return  name;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
