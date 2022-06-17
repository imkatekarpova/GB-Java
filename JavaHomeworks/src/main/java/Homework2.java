public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(from10To20(-3, 12));
        System.out.println();
        System.out.println("Задание 2");
        whatSign(-34);
        System.out.println();
        System.out.println("Задание 3");
        System.out.println(isNegative(8));
        System.out.println();
        System.out.println("Задание 4");
        printNStrings(7, "Отличный день!");
        System.out.println();
        System.out.println("Задание 5");
        System.out.println(isItALeapYear(1997));
    }

    public static boolean from10To20(int a, int b) {
        if (a+b >= 10 && a+b <= 20) {
        return true;
        } else {
            return false;
        }
    }

    public static void whatSign(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printNStrings(int n, String str) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". " + str);
        }
    }

    public static boolean isItALeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
