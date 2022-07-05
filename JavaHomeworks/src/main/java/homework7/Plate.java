package homework7;

public class Plate {
    private int foodAmount;

    public Plate(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void setFoodAmount(int amount) {
        this.foodAmount = amount;
    }

    public int getFoodAmount(){
        return foodAmount;
    }

    //метод для добавления еды
    public void increaseFoodAmount(int foodToAdd) {
        foodAmount += foodToAdd;
    }

    public void decreaseFoodAmount(int foodToRemove) {
        if (foodToRemove <= foodAmount) {
            foodAmount -= foodToRemove;
        } else
            System.out.println("Не хватило еды");
    }


}
