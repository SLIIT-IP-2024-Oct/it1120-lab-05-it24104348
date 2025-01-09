import java.util.Scanner;

public class IT24104348Lab5Q3 {
    public static void main(String[] args) {
         final int ROOM_CHARGE = 48000; 
        final int DISCOUNT_10 = 10;  
        final int DISCOUNT_20 = 20;   

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        int reservedDays = endDate - startDate;
        double totalAmount = reservedDays * ROOM_CHARGE;
        double discount = 0;

        if (reservedDays > 3) {
            discount = (reservedDays >= 5) ? DISCOUNT_20 : DISCOUNT_10;
            totalAmount -= totalAmount * discount / 100;
        }

        System.out.println("Number of days reserved: " + reservedDays);
        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Total amount to be paid: Rs. " + totalAmount);
    }
}