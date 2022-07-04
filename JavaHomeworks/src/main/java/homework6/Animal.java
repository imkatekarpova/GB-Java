package homework6;

public class Animal {
    public String name;
    public String color;
    //в следующи переменных бзадам ограничения на возможности животеых
    private static int runRest;
    private static int swimRest;

    public Animal() {}

    public Animal(String name, String color, int runRest, int swimRest) {
        this.name = name;
        this.color = color;
    }

    //
    public void run(int n) {
        System.out.println(name + " ran " + n + "m.");
    }

    public void swim(int n) {
        System.out.println(name + " swam " + n + "m.");
    }


}
