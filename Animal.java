public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some animals sound");
    }

    public void eat() {
        System.out.println("Feeding");
    }

    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    public void eat(String foodType) {
        System.out.println(name + " is Feeding " + foodType);
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }
}
