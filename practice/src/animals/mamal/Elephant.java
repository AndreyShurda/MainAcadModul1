package animals.mamal;

/**
 * Created by User on 12.02.2017.
 */
public class Elephant extends Mammal {
    private static int countOfElephant;
    private int idElephant = getCountOfElephant();

    public Elephant() {
        countOfElephant++;
        idElephant = countOfElephant;
        setIdAnimal(idElephant);
//        setIdElephant(countOfElephant);
        setFood("grass");
    }

    public static int getCountOfElephant() {
        return countOfElephant;
    }

    public int getIdElephant() {
        return idElephant;
    }

    public void setIdElephant(int idElephant) {
        this.idElephant = idElephant;
    }
}
