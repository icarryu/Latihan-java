package zoo;

public class Cat extends Animal {
    public boolean hasFur;
    public int numberOfWhiskers;
    // private int lives = 9;

    public Cat(String nama, String spesies, String food, boolean hasFur, int numberOfWhiskers) {
        super(nama, spesies, food);
        this.hasFur = hasFur;
        this.numberOfWhiskers = numberOfWhiskers;
    }

    public void makeSound() {
        System.out.println("Meow");
    }

}
