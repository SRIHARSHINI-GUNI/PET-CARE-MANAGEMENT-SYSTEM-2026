
package petcare;

public class HealthRecord {
    private Pet pet;
    private String medicalDetails;
    private String treatment;

    public HealthRecord(Pet pet, String medicalDetails,
                        String treatment) {
        this.pet = pet;
        this.medicalDetails = medicalDetails;
        this.treatment = treatment;
    }

    public void displayRecord() {
        System.out.println("Pet: " + pet.getName());
        System.out.println("Health Details: " + medicalDetails);
        System.out.println("Treatment: " + treatment);
        System.out.println("------------------------");
    }
}
