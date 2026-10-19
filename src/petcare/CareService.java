
package petcare;

public interface CareService {
    void registerPet(Pet pet);
    void viewPets();
    void bookAppointment(Appointment appointment);
    void viewAppointments();
}
