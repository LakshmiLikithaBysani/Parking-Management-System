import java.util.Scanner;

public class ParkingManagementSystem {

    static boolean[] parkingSlots = new boolean[10];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== PARKING MANAGEMENT SYSTEM ===");
            System.out.println("1. View Parking Slots");
            System.out.println("2. Park Vehicle");
            System.out.println("3. Remove Vehicle");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n=== Parking Slots ===");

                    for (int i = 0; i < parkingSlots.length; i++) {

                        if (parkingSlots[i]) {
                            System.out.println(
                                "Slot " + (i + 1) + " - Occupied"
                            );
                        } else {
                            System.out.println(
                                "Slot " + (i + 1) + " - Available"
                            );
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter slot number to park (1-10): ");
                    int parkSlot = sc.nextInt();

                    if (parkSlot >= 1 && parkSlot <= 10) {

                        if (!parkingSlots[parkSlot - 1]) {

                            parkingSlots[parkSlot - 1] = true;

                            System.out.println(
                                "Vehicle parked successfully."
                            );

                        } else {
                            System.out.println("Slot is already occupied.");
                        }

                    } else {
                        System.out.println("Invalid slot number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter slot number to remove vehicle (1-10): ");
                    int removeSlot = sc.nextInt();

                    if (removeSlot >= 1 && removeSlot <= 10) {

                        if (parkingSlots[removeSlot - 1]) {

                            parkingSlots[removeSlot - 1] = false;

                            System.out.println(
                                "Vehicle removed successfully."
                            );

                        } else {
                            System.out.println("Slot is already empty.");
                        }

                    } else {
                        System.out.println("Invalid slot number.");
                    }
                    break;

                case 4:
                    System.out.println(
                        "Thank you for using Parking Management System."
                    );
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
