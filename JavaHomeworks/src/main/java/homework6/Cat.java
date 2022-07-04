package homework6;

public class Cat extends Animal{
    //переопределю рестрикшены:
    private int runRest = 200;
    private int swimRest = 0;
    private int age;
    private boolean isCute;

    public Cat(String name, String color, int age, boolean isCute) {
        this.name = name;
        this.age = age;
        this.isCute = isCute;

    }

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
