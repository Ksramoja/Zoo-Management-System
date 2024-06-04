import java.util.ArrayList;
import java.util.List;

 public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Ray", 5));
        animals.add(new Elephant("Dumbo", 10));
        animals.add(new Monkey("George", 3));

        ZooKeeper zooKeeper = new ZooKeeper("John");

        System.out.println("Welcome to the Queen elizabeth Zoo!");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        zooKeeper.feedAnimals(animals);
        zooKeeper.listenToAnimals(animals);

        System.out.println("Demonstrating polymorphism with overloaded methods");
        animals.get(0).makeSound(5);
        animals.get(1).eat("fruits");
        animals.get(2).eat("nuts");
    }
}
