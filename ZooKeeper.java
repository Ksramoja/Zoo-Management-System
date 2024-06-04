import java.util.List;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimals(List<Animal> animals) {
        System.out.println(name + " is feeding the animals...");
        for (Animal animal : animals) {
            System.out.println("Feeding " + animal.name);
            animal.eat();
        }
    }

    public void listenToAnimals(List<Animal> animals) {
        System.out.println(name + " is listening to the animals...");
        for (Animal animal : animals) {
            System.out.println("Listening to " + animal.name);
            animal.makeSound();
        }
    }
}
