import java.util.Scanner;

public class Task1BookstoreDiscountAttendanceNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        String day = sc.nextLine().trim();

        System.out.print("Enter book type (dictionary / novel / other): ");
        String type = sc.nextLine().trim();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter price per book: ");
        double price = sc.nextDouble();

        double totalPrice = qty * price;
        double discount = 0;

        // Level 1: discount only applies on Wednesday
        if (day.equalsIgnoreCase("Wednesday")) {
            // Level 2: book type
            if (type.equalsIgnoreCase("dictionary")) {
                // Level 3: quantity
                if (qty > 2) {
                    discount = 12;
                } else {
                    discount = 10;
                }
            } else if (type.equalsIgnoreCase("novel")) {
                if (qty > 3) {
                    discount = 5;
                } else {
                    discount = 0;
                }
            } else { // other books
                if (qty > 3) {
                    discount = 9;
                } else {
                    discount = 8;
                }
            }
        } else {
            discount = 0;
        }

        double discountAmount = totalPrice * (discount / 100);
        double totalPay = totalPrice - discountAmount;

        System.out.println("-----------------------------");
        System.out.println("Total price    : " + totalPrice);
        System.out.println("Discount (" + discount + "%): " + discountAmount);
        System.out.println("Total to pay   : " + totalPay);

        sc.close();
    }
}
