package zoo;

public abstract class Animal {
    public String nama;
    public String spesies;
    public String food;
    private int energy = 30;
    private int hungerLevel = 0;

    public Animal(String nama, String spesies, String food) {
        this.nama = nama;
        this.spesies = spesies;
        this.food = food;
    }

    public boolean isHungry() {
        return this.hungerLevel >= 50;
    }

    public boolean isTired() {
        return this.energy < 10;
    }

    public abstract void makeSound();

    public void sleep() {
        this.energy++;
        this.hungerLevel++;
    }

}
