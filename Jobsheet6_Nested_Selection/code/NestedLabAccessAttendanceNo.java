import java.util.Scanner;

public class NestedLabAccessAttendanceNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isActiveStudent;
        boolean isSanctioned;
        boolean hasLecturerPermit;
        boolean isLabAssistant;

        System.out.print("Is active student? (true/false): ");
        isActiveStudent = sc.nextBoolean();

        System.out.print("Is sanctioned? (true/false): ");
        isSanctioned = sc.nextBoolean();

        System.out.print("Has lecturer permit? (true/false): ");
        hasLecturerPermit = sc.nextBoolean();

        System.out.print("Is lab assistant? (true/false): ");
        isLabAssistant = sc.nextBoolean();

        // Level 1: student status
        if (isActiveStudent && !isSanctioned) {
            // Level 2: permission
            if (hasLecturerPermit || isLabAssistant) {
                System.out.println("Laboratory access granted");
            } else {
                System.out.println("Access denied: lecturer permission or lab assistant status required");
            }
        } else {
            System.out.println("Access denied: student status does not meet the requirement");
        }

        sc.close();
    }
}
