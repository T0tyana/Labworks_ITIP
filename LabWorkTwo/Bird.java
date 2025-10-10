package animals;

class Bird extends Animal {
    private boolean canFly;
    private double wingSpan;

    public Bird() {
        super();
        this.canFly = true;
        this.wingSpan = 0.0;
    }

    public Bird(String name, int age, double weight, boolean canFly, double wingSpan) {
        super(name, age, weight);
        this.canFly = canFly;
        this.wingSpan = wingSpan;
    }

    public void fly() {
        if (canFly) {
            System.out.println(getName() + " летит (размах крыла: " + wingSpan + " м)");
        } else {
            System.out.println(getName() + " не умеет летать");
        }
    }

    public void buildNest() {
        System.out.println(getName() + " строит гнездо");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " издает звук (птица)");
    }
    @Override
    public void move() {
        System.out.println(getName() + " ходит или прыгает");
    }

    public boolean isCanFly() { 
        return canFly; 
    }
    public void setCanFly(boolean canFly) { 
        this.canFly = canFly; 
    }

    public double getWingSpan() { 
        return wingSpan; 
    }
    public void setWingSpan(double wingSpan) { 
        this.wingSpan = wingSpan; 
    }
}
