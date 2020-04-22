public class Suma
{
    private int number_one;
    private int number_two;

    public Suma(int number_one, int number_two) {
        this.number_one=number_one;
        this.number_two=number_two;
    }

    public int sumar(){
        return number_one + number_two;
    }
}