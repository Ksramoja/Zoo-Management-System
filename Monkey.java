public class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Chatter");
    }

    @Override
    public void eat() {
        System.out.println(name + " is Feeding on bananas");
    }
}
