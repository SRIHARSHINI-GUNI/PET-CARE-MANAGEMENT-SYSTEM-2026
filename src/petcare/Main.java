
package petcare;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PetCareManager manager = new PetCareManager();

        int choice=0;

        do {
            System.out.println("\n===== PET CARE MANAGEMENT SYSTEM =====");
            System.out.println("1. Register a Pet");
            System.out.println("2. View All Pets");
            System.out.println("3. Book Appointment");
            System.out.println("4. View Appointments");
            System.out.println("5. Add Health Record");
            System.out.println("6. View Health Records");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter pet type (Dog/Cat): ");
                    String type = sc.nextLine().trim();

                    System.out.print("Enter pet name: ");
                    String name = sc.nextLine().trim();

                    System.out.print("Enter pet age: ");
                    int age;

                    try {
                        age = Integer.parseInt(sc.nextLine().trim());

                        if (age < 0) {
                            System.out.println("Age cannot be negative.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid age.");
                        break;
                    }

                    System.out.print("Enter owner name: ");
                    String owner = sc.nextLine().trim();

                    if (name.isEmpty() || owner.isEmpty()) {
                        System.out.println(
                                "Pet name and owner name are required.");
                        break;
                    }

                    Pet pet;

                    if (type.equalsIgnoreCase("Dog")) {
                        pet = new Dog(name, age, owner);
                    } else if (type.equalsIgnoreCase("Cat")) {
                        pet = new Cat(name, age, owner);
                    } else {
                        System.out.println("Invalid pet type.");
                        break;
                    }

                    manager.registerPet(pet);
                    break;

                case 2:
                    manager.viewPets();
                    break;

                case 3:
                    System.out.print("Enter pet name: ");
                    String petName = sc.nextLine().trim();

                    Pet selectedPet = manager.findPet(petName);

                    if (selectedPet == null) {
                        System.out.println("Pet not found. Register it first.");
                        break;
                    }

                    System.out.print("Enter appointment date: ");
                    String date = sc.nextLine().trim();

                    System.out.print("Enter appointment time: ");
                    String time = sc.nextLine().trim();

                    System.out.print("Enter reason for visit: ");
                    String reason = sc.nextLine().trim();

                    if (date.isEmpty() || time.isEmpty()
                            || reason.isEmpty()) {
                        System.out.println("All fields are required.");
                        break;
                    }

                    Appointment appointment = new Appointment(
                            selectedPet, date, time, reason);

                    manager.bookAppointment(appointment);
                    break;

                case 4:
                    manager.viewAppointments();
                    break;

                case 5:
                    System.out.print("Enter pet name: ");
                    String recordPetName = sc.nextLine().trim();

                    Pet recordPet = manager.findPet(recordPetName);

                    if (recordPet == null) {
                        System.out.println("Pet not found. Register it first.");
                        break;
                    }

                    System.out.print("Enter health details: ");
                    String details = sc.nextLine().trim();

                    System.out.print("Enter treatment: ");
                    String treatment = sc.nextLine().trim();

                    if (details.isEmpty() || treatment.isEmpty()) {
                        System.out.println("All fields are required.");
                        break;
                    }

                    HealthRecord record = new HealthRecord(
                            recordPet, details, treatment);

                    manager.addHealthRecord(record);
                    break;

                case 6:
                    manager.viewHealthRecords();
                    break;

                case 7:
                    System.out.println("Thank you for using Pet Care Management!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (true && choice != 7);

        sc.close();
    }
}
