public class Customer
{
    public string Name { get; }
    public string LicenseNumber { get; set; }

    public Customer(string name, string licenseNumber)
    {
        Name = name;
        LicenseNumber = licenseNumber;
    }
}
