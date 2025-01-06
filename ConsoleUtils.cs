using System;

public static class ConsoleUtils
{
    public static void ClearScreen()
    {
        Console.Clear();
    }

    public static void PrintBanner()
    {
        Console.WriteLine("=======================================");
        Console.WriteLine("      Welcome to Car Rental System     ");
        Console.WriteLine("=======================================");
    }

    public static void PrintSeparator()
    {
        Console.WriteLine("---------------------------------------");
    }
}
