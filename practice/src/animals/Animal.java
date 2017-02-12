package animals;

/**
 * Created by User on 12.02.2017.
 */
public class Animal {

    private String food = "food";
    private int idAnimal;

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    protected void eat() {
        if (getIdAnimal() == 0) {
            System.out.println("Animal is " + this.getClass().getSimpleName() + " eats " + food);
        } else {
            System.out.println("Animal is " + this.getClass().getSimpleName() + " " + getIdAnimal() + " eats " + food);
        }

    }


}
