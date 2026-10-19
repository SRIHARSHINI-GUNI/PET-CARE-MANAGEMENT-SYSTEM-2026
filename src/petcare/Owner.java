
package petcare;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private String phone;
    private final List<Pet> pets = new ArrayList<>();

    public Owner(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void displayOwnerDetails() {
        System.out.println("Owner: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Number of pets: " + pets.size());
    }
}
