import java.util.Scanner;

public class Task3_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of stores: ");
        int numStores = sc.nextInt();

        if (numStores < 1) {
            System.out.println("Number of stores must be at least 1.");
        } else {
            int storeNo = 1;
            int totalItemsAll = 0;
            int highestItems = -1;
            int bestStore = 0;

            while (storeNo <= numStores) {
                System.out.println("Store " + storeNo);

                int numCustomers;
                do {
                    System.out.print("  Number of customers: ");
                    numCustomers = sc.nextInt();
                    if (numCustomers < 0) {
                        System.out.println("  Must not be negative. Retry!");
                    }
                } while (numCustomers < 0);

                int totalItems = 0;

                for (int c = 1; c <= numCustomers; c++) {
                    int items;
                    do {
                        System.out.print("  Items bought by customer " + c + ": ");
                        items = sc.nextInt();
                        if (items < 0) {
                            System.out.println("  Must not be negative. Retry!");
                        }
                    } while (items < 0);
                    totalItems += items;
                }

                System.out.println("Store " + storeNo + " - customers: " + numCustomers
                        + ", total items: " + totalItems);

                totalItemsAll += totalItems;

                if (totalItems > highestItems) {
                    highestItems = totalItems;
                    bestStore = storeNo;
                }

                storeNo++;
            }

            System.out.println("Total items across all stores: " + totalItemsAll);
            System.out.println("Store with the most items: " + bestStore);
        }
        sc.close();
    }
}
