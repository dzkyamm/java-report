import java.util.Scanner;
public class Task3_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of stores: ");
        int numStores = sc.nextInt();

        if (numStores <= 0) {
            System.out.println("Number of stores must be at least 1.");
            sc.close();
            return;
        }

        int totalItemsAllStores = 0;
        int maxItems = -1;
        int bestStore = 0;

        for (int i = 1; i <= numStores; i++) {
            System.out.println("Store " + i);
            System.out.print("Enter the number of customers: ");
            int numCustomers = sc.nextInt();

            int totalItemsStore = 0;

            for (int j = 1; j <= numCustomers; j++) {
                System.out.print("Enter items bought by customer " + j + ": ");
                int items = sc.nextInt();
                totalItemsStore += items;
            }

            System.out.println("Store " + i + " customers: " + numCustomers + ", total items: " + totalItemsStore);

            totalItemsAllStores += totalItemsStore;

            if (totalItemsStore > maxItems) {
                maxItems = totalItemsStore;
                bestStore = i;
            }
        }

        System.out.println("----------------------------------------");
        System.out.println("Total items across all stores: " + totalItemsAllStores);
        System.out.println("Store with the most items: " + bestStore);

        sc.close();
    }
}