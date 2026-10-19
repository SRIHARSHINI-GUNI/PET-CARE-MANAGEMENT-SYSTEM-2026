
package petcare;

public class Appointment {
    private Pet pet;
    private String date;
    private String time;
    private String reason;

    public Appointment(Pet pet, String date,
                       String time, String reason) {
        this.pet = pet;
        this.date = date;
        this.time = time;
        this.reason = reason;
    }

    public void displayAppointment() {
        System.out.println("Pet: " + pet.getName());
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Reason: " + reason);
        System.out.println("------------------------");
    }
}
