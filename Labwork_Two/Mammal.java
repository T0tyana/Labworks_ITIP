package animals;

class Mammal extends Animal {
    private boolean hasFur;
    private String furColor;

    public Mammal() {
        super();
        this.hasFur = true;
        this.furColor = "неизвестный";
    }

    public Mammal (String name, int age, double weight, boolean hasFur, String furColor) {
        super(name, age, weight);
        this.hasFur = hasFur;
        this.furColor = furColor;
    }

    public void feedMilk() {
        System.out.println(getName() + " кормит детёнышей молоком");
    }

    public void sleep() {
        System.out.println(getName() + " спит");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " издает звук (млекопитающее)");
    }

    @Override
    public void move() {
        System.out.println(getName() + " ходит или бегает");
    }

    public boolean isHasFur() {
        return hasFur;
    }
    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
    public String getFurColor() {
        return furColor;
    }
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}    