package animals;

class Fish extends Aquatic {
    private String species;
    private String scaleColor;
    private double tankVolume;

    public Fish() {
        super();
        this.species = "неизвестный";
        this.scaleColor = "неизвестный";
        this.tankVolume = 0.0;
    }

    public Fish(String name, int age, double weight, String waterType, int fins, String species, String scaleColor, double tankVolume) {
        super(name, age, weight, waterType, fins);
        this.species = species;
        this.scaleColor = scaleColor;
        this.tankVolume = tankVolume;
    }

    public void blowBubbles() {
        System.out.println(getName() + " выпускает пузырьки");
    }

    public void swimFaster() {
        System.out.println(getName() + " ускоряется и быстро плывёт");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " тихо \"булькает\"");
    }

    @Override
    public void move() {
        swim();
    }

    public String getSpecies() { 
        return species; 
    }
    public void setSpecies(String species) { 
        this.species = species; 
    }

    public String getScaleColor() { 
        return scaleColor; 
    }
    public void setScaleColor(String scaleColor) { 
        this.scaleColor = scaleColor; 
    }

    public double getTankVolume() { 
        return tankVolume; 
    }
    public void setTankVolume(double tankVolume) { 
        this.tankVolume = tankVolume; 
    }
}