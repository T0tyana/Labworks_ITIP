package animals;

class Aquatic extends Animal {
    private String waterType;
    private int fins;

    public Aquatic() {
        super();
        this.waterType = "неизвестный";
        this.fins = 0;
    }

    public Aquatic (String name, int age, double weight, String waterType, int fins) {
        super(name, age, weight);
        this.waterType = waterType;
        this.fins = fins;
    }

     public void swim() {
        System.out.println(getName() + " плавает (" + waterType + ")");
    }

    public void blowBubbles() {
        System.out.println(getName() + " выпускает пузырьки");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " издаёт тихие водные звуки");
    }    

    @Override
    public void move() {
        swim();
    }

    public String getWaterType() { 
        return waterType; 
    }
    public void setWaterType(String waterType) { 
        this.waterType = waterType; 
    }

    public int getFins() { 
        return fins; 
    }
    public void setFins(int fins) { 
        this.fins = fins; 
    }
}