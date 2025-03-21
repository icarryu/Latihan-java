package zoo;

public class Dog extends Animal {

    public Dog(String nama, String spesies, String food, boolean hasFur, int numberOfWhiskers) {
        super(nama, spesies, food);
    }

    public void makeSound() {
        System.out.println("Guk guk");
    }

}
