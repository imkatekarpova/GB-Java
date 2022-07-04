package homework6;

public class Dog extends Animal{
    //переопределю рестрикшены и добавляю новые поля
    private int runRest = 500;
    private int swimRest = 10;
    private int age;
    private String breed;
    private boolean isCute;

    public Dog(String name, String color, int age, String breed, boolean isCute) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isCute = isCute;
    }
    //переопределяю методы
    @Override
    public void run(int n){
        if (n > runRest) {
            System.out.println(name + " can't run that much");
        } else {
            System.out.println(name + " ran " + n + " m.");
        }
    }
    public void swim(int n){
        if (n > swimRest) {
            System.out.println(name + " can't swim that much");
        } else {
            System.out.println(name + " swam " + n + " m.");
        }
    }

}
