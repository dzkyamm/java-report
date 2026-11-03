package week9;
import java.util.Scanner;
public class FlowchartAssignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type;
        int duration = 0;
        int total = 0;

        do {
            System.out.print("Type '1' for Car \nType '2' for Motorcycle \nType '0' to exit \nInput vehicle type (input number) : ");
            type = sc.nextInt();
            if (type == 1 || type == 2) {
                System.out.print("Input duration (hours) : ");
                duration = sc.nextInt();
            } if (type == 1) {
                total = duration * 3000;
            } else if (type == 2) {
                total = duration * 2000;
            }

        if (type == 1) {
            System.out.println("====Total Parking Cost====");
            System.out.println("Vehicle type : Car");
            System.out.println("Duration : " + duration);
            System.out.println("Total cost : " + total);
            System.out.println("==========================");
        }

        if (type == 2) {
            System.out.println("====Total Parking Cost====");
            System.out.println("Vehicle type : Motorcycle");
            System.out.println("Duration : " + duration);
            System.out.println("Total cost : " + total);
            System.out.println("==========================");
        }
        
        } while (type != 0); 
        System.out.println("Exit.");

        sc.close();


    }
}
