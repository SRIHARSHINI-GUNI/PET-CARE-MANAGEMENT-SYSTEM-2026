
package petcare;

public class Cat extends Pet {

    public Cat(String name, int age, String ownerName) {
        super(name, age, ownerName);
    }

    public void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }

    public void displayDetails() {
        System.out.println("\n--- Cat Details ---");
        super.displayDetails();
        makeSound();
    }
}
