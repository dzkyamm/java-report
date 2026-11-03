package week9;

import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ticketPrice = 50000;
        int totalTicketSold = 0;
        double totalRevenue = 0;

        while (true) {
            System.out.print("Enter number ticket purchased (type 0 to finish) :");
            int quantity = sc.nextInt();

            if (quantity ==  0) {
                break;
            }
            if (quantity < 0) {
                System.out.println("Invalid input number");
            }

            double subtotal = quantity*ticketPrice;
            double discount = 0;

            if (quantity > 4 ) {
                discount = 0.1;    
            } else if (quantity > 10) {
                discount = 0.15;
            }

            double finalPrice = subtotal - (subtotal * discount);
            totalTicketSold += quantity;
            totalRevenue += finalPrice;

            System.out.println("Subtotal after discount: Rp " + finalPrice);
            System.out.println("----------------------------------------");
        }

        System.out.println("\n -- Today's Sales Report -- ");
        System.out.println("Total tickets sold : " + totalTicketSold);
        System.out.println("Total revenue      : Rp " + totalRevenue);
        
        sc.close();

    }
}
