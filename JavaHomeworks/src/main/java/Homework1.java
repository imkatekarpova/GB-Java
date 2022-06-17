public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Задание 2");
        printThreeWords();
        System.out.println("Задание 3");
        checkSumSign();
        System.out.println("Задание 4");
        printColor();
        System.out.println("Задание 5");
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    public static void checkSumSign(){
        int a = 7;
        int b = -10;
        if (a+b >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println();
    }

    public static void printColor(){
        int value = 324;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <=100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
        System.out.println();
    }

    public static void compareNumbers(){
        int a = 23;
        int b = -456;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
