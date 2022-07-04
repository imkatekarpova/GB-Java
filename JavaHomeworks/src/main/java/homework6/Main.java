package homework6;

public class Main {
    public static void main(String[] args) {
        //создаю и тестирую кота
        Cat cat1 = new Cat("Fluffy", "black", 4, true);
        Cat cat2 = new Cat("Kitty", "red", 1, true);
        cat1.run(200);
        cat1.run(1000);
        cat1.swim(20);

        //создаю и тестирую пса
        Dog dog = new Dog("Rex", "white", 8, "sheepdog", false);
        dog.run(499);
        dog.run(100500);
        dog.swim(7);
        dog.swim(124);
    }
}
