public class Car
{
    public string LicensePlate { get; }
    public string Model { get; }
    public bool IsAvailable { get; set; }

    public Car(string licensePlate, string model)
    {
        LicensePlate = licensePlate;
        Model = model;
        IsAvailable = true;
    }
}
