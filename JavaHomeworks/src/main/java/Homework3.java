import java.util.Arrays;
import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Задане 1");
        replace01();
        System.out.println("Задане 2");
        array100();
        System.out.println("Задане 3");
        modifyArray();
        System.out.println("Задане 4");
        arraySetDiags();
        System.out.println("Задание 5");
        System.out.println(Arrays.toString(getArray(5, 48)));
        System.out.println("Задание 6");
        arrayMaxMin();
        System.out.println("Задание 7");
        int[] arr7 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr7));
    }

    public static void replace01() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void array100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void modifyArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arraySetDiags() {
        int[][] arr = new int[7][7];
        //присвою элементам главной диагоналей единицы, а всем остальным - нули
        //с главной все просто, i==j
        //побочная: i+j = length - 1 (так как нумерация с нуля)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == j) || (i + j == arr.length - 1)) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
            //выведем в цикле
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int[] getArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void arrayMaxMin() {
        Random rand = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        //задала массив рандомных чичел, ищу макс и мин (в одном цикле)
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            ;
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }

    public static boolean checkBalance(int[] arr) {
        boolean check = false;
        System.out.println(Arrays.toString(arr));
        //цикл по k (адрес последнего левого элемена.
        //во вложенном считаем левую сумму (до k) и правую (после k)
        //можно еще оптимизировать, но я тороплюсь
        for (int k=0; k<arr.length; k++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i<arr.length; i++) {
                if (i <= k) {
                    leftSum += arr[i];
                } else {
                    rightSum += arr[i];
                }
            }
            if (leftSum == rightSum) {
                check = true;
                break;
            }
        }
        return check;
    }
}