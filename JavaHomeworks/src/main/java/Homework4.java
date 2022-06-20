import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Homework4 {
    //Крестики-нолики
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int size = 5;
    static char[][] table;
    static final char xMark = 'X';
    static final char oMark = 'O';
    static final char empty = '.';

    static int count = 4;


    public static void main(String[] args) {
        //отрисовываем табличку
        initTable();
        printTable();
    while (true) {
        turnHuman();
        printTable();
        if (checkWin(xMark)) {
            System.out.println("Human won!");
            break;
        }

        if (tableIsFull()) {
            System.out.println("DRAW!");
            break;
        }

        turnComputer();
        printTable();
        if (checkWin(oMark)) {
            System.out.println("Computer won!");
            break;
        }
    }
    }

    private static boolean tableIsFull() {
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                if (table[i][j] == empty) return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {
        //if (table[0][0] == symbol && table[0][1] == symbol && table[0][2] == symbol) return true;
       // if (table[1][0] == symbol && table[1][1] == symbol && table[1][2] == symbol) return true;
        //if (table[2][0] == symbol && table[2][1] == symbol && table[2][2] == symbol) return true;
        //if (table[0][0] == symbol && table[1][0] == symbol && table[2][0] == symbol) return true;
        //if (table[0][1] == symbol && table[1][1] == symbol && table[2][1] == symbol) return true;
        //if (table[0][2] == symbol && table[1][2] == symbol && table[2][2] == symbol) return true;
        //if (table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol) return true;
        //if (table[0][2] == symbol && table[1][1] == symbol && table[2][0] == symbol) return true;
        //return false;
        //переделаю алгоритм через циклы
        //проверяем строки и столбцы сразу. при равенстве двух элементов в строке
        //буду увеличивать соотв. переменную. если ее значение достигнет size-1, возвращу выигрыш
        //аналогично со столбцами. запущу их в одном и том же цикле
        // это сработает и для размера поля 5х5. только надо задать количество фишек переменной
        // 4 фишки - три совпадения символов.

        for (int i=0; i<size; i++) {
            int row = 0;
            int col = 0;
            for (int j=1; j<size; j++) {
                if (table[i][j] == symbol && table[i][j-1] == symbol) row +=1;
                if (table[j][i] == symbol && table[j-1][i] == symbol) col+=1;
            }
            if (col == count-1 || row == count-1) return true;
        }
        //есть подозрение, что для проверкм диагоналей, достаточно одномерного массива.
        //сча посмотрим (запускаем с 1го, потому что будем сравнивать тек. элемент с предыдущим
        int d1 = 0;
        int d2 = 0;
        for (int i=1; i<size; i++) {
            if (table[i-1][i-1] == symbol && table[i][i] == symbol) d1 += 1;
            if (table[i][size-i-1] == symbol && table[i-1][size - i] == symbol) d2 +=1;
        }
        if (d1 == count - 1 || d2 == count - 1) return true;
        return false;
    }
    private static void printTable() {
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void initTable() {
        table = new char[size][size];
        for (int i=0; i<size;i++) {
            for (int j=0; j<size; j++) {
                table[i][j] = empty;
            }
        }
    }

    private static void turnHuman() {
        int x,y;
        do {
        System.out.println("Enter x y from 1 to 3");
        x = scanner.nextInt() - 1;
        y = scanner.nextInt() - 1;
    } while (!isValidCell(x,y));
        table[x][y] = xMark;
    }

    private static boolean isValidCell(int x, int y) {
        if (x >= size || y >= size || x < 0 || y < 0) {return false;}
        if (table[x][y] == empty) {return true;}
        return false;
    }
    //границей для рандома тоже задам size. это ж размер поля
    private static void turnComputer() {
            int x,y;
            do {
                x = random.nextInt(size);
                y = random.nextInt(size);
            } while (!isValidCell(x,y));
            table[x][y] = oMark;

        System.out.println("Computer filled [" + (x+1) + ", " + (y+1) + "]");
    }
}

