package week9;
import java.util.Scanner;
public class CinemaTicketsAssignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ticketPrice = 50000;

        //input
        while (true) {
            System.out.print("Total ticket purchased (type '0' to cancel) : ");
            int ticketTotal = sc.nextInt();

            if (ticketTotal == 0) {
                System.out.println("Canceled.");
                break;
            } if (ticketTotal < 0) {
                System.out.println("invalid input, dont input less than 0!");
                continue;
            }
        
            double discount = 0;

            

            if (ticketTotal >4 && ticketTotal <= 10) {
                discount = 0.1;
            } if (ticketTotal > 10) {
                discount = 0.15;
            }

            //calculation
            double totalPrice = ticketPrice * ticketTotal;
            double discountAmount = ticketPrice * discount * ticketTotal;
            double total = totalPrice - discountAmount;

            //output
            System.out.println("=====Ticket Transactions=====");
            System.out.println("Ticket sold : " + ticketTotal);
            System.out.println("Discount : " + discount);
            System.out.println("Total revenue : " + (int) total);
            System.out.println("=============================");
        }
        sc.close();
    }
}