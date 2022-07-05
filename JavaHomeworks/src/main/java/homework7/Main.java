package homework7;

public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(150);
        //массив из трех котов задам сразу. тарелка будет одна на всех
        Cat catsArray[] = new Cat[4];
        catsArray[0] = new Cat("Барсик", 45);
        catsArray[1] = new Cat("Пушок", 70);
        catsArray[2] = new Cat("Лео", 55);
        catsArray[3] = new Cat("Вася", 200);

        //в цикле каждый кот поест из тарелки. доложу в тарелку еды, если еда закончится
        for (int i = 0; i<catsArray.length; i++) {
            System.out.println("Сейчас " + catsArray[i].getName() + " будет есть");
            if (catsArray[i].eat(plate)) {
                System.out.println("Сытость котика " + catsArray[i].getName() + ": " + catsArray[i].getSatiety());
            } else {
                System.out.println("Сытость котика " + catsArray[i].getName() + ": " + catsArray[i].getSatiety());
                System.out.println(catsArray[i].getName() + " не поел, ему не хватило еды.");
               // System.out.println("Сейчас добавим еды в тарелку.");
              //  plate.increaseFoodAmount(100);
               // catsArray[i].eat(plate);
            }
        }
    }
}
