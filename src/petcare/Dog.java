
package petcare;

public class Dog extends Pet {

    public Dog(String name, int age, String ownerName) {
        super(name, age, ownerName);
    }

    public void makeSound() {
        System.out.println("Dog says: Bow Bow!");
    }

    public void displayDetails() {
        System.out.println("\n--- Dog Details ---");
        super.displayDetails();
        makeSound();
    }
}
