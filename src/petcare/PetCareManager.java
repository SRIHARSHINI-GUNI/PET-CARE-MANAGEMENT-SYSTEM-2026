
package petcare;

import java.util.ArrayList;
import java.util.List;

public class PetCareManager implements CareService {

    private final List<Pet> pets = new ArrayList<>();
    private final List<Appointment> appointments =
            new ArrayList<>();
    private final List<HealthRecord> records =
            new ArrayList<>();

    @Override
    public void registerPet(Pet pet) {
        pets.add(pet);
        System.out.println("Pet registered successfully!");
    }

    @Override
    public void viewPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets registered yet.");
            return;
        }

        for (Pet pet : pets) {
            pet.displayDetails();
        }
    }

    @Override
    public void bookAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment booked successfully!");
    }

    @Override
    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return;
        }

        for (Appointment appointment : appointments) {
            appointment.displayAppointment();
        }
    }

    public Pet findPet(String name) {
        for (Pet pet : pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
    }

    public void addHealthRecord(HealthRecord record) {
        records.add(record);
        System.out.println("Health record added successfully!");
    }

    public void viewHealthRecords() {
        if (records.isEmpty()) {
            System.out.println("No health records available.");
            return;
        }

        for (HealthRecord record : records) {
            record.displayRecord();
        }
    }
}
