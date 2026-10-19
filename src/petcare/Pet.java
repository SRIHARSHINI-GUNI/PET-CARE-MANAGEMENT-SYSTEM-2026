
package petcare;

public abstract class Pet {
    private String name;
    private int age;
    private String ownerName;

    public Pet(String name, int age, String ownerName) {
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
    }

    public Pet(String name, int age) {
        this(name, age, "Unknown");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public abstract void makeSound();

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Owner: " + ownerName);
    }
}
