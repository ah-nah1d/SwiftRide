public class ConsoleUtils {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printBanner() {
        System.out.println("=======================================");
        System.out.println("      Welcome to Car Rental System     ");
        System.out.println("=======================================");
    }

    public static void printSeparator() {
        System.out.println("---------------------------------------");
    }
}
