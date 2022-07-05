package homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSatiety() {
        this.satiety = true;
    }

    public boolean getSatiety(){
        return satiety;
    }

    public boolean eat(Plate plate){
        if (plate.getFoodAmount() >= appetite) {
            plate.decreaseFoodAmount(appetite);
            //устанавлваю сытость коту, который поел прямо внутри метода
            setSatiety();
            return true;
        } else
        return false;
    }
}
