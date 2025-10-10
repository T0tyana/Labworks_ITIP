package animals;

class Cat extends Mammal {
    private String breed;
    private boolean isIndoor;
    private int clawSharpness;

    private static int catCount = 0;

    public Cat() {
        super();
        this.breed = "неизвестный";
        this.isIndoor = true;
        this.clawSharpness = 5;
        catCount++;
    }

    public Cat (String name, int age, double weight, boolean hasFur, String furColor, String breed, boolean isIndoor, int clawSharpness) {
        super(name, age, weight, hasFur, furColor);
        this.breed = breed;
        this.isIndoor = isIndoor;
        this.clawSharpness = clawSharpness;
        catCount++;
    }

    public void purr() {
        System.out.println(getName() + " мурчит");
    }

    public void scratch() {
        System.out.println(getName() + " точит когти (острота:" + clawSharpness + ")");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " крадётся и прыгает");
    }

    public static int getCatCount() {
        return catCount;
    }

    public String getBreed() { 
        return breed; 
    }
    public void setBreed(String breed) { 
        this.breed = breed; 
    }

    public boolean isIndoor() { 
        return isIndoor; 
    }
    public void setIndoor(boolean indoor) { 
        isIndoor = indoor; 
    }

    public int getClawSharpness() { 
        return clawSharpness; 
    }
    public void setClawSharpness(int clawSharpness) { 
        this.clawSharpness = clawSharpness; 
    }
}