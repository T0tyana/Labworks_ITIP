package animals;

class Parrot extends Bird {
    private int vocabularySize;
    private String color;
    private boolean canTalk;

    public Parrot() {
        super();
        this.vocabularySize = 0;
        this.color = "неизвестный";
        this.canTalk = false;
    }

    public Parrot(String name, int age, double weight, boolean canFly, double wingSpan, int vocabularySize, String color, boolean canTalk) {
        super(name, age, weight, canFly, wingSpan);
        this.vocabularySize = vocabularySize;
        this.color = color;
        this.canTalk = canTalk;
    }

    public void mimic(String phrase) {
        System.out.println(getName() + " повторяет: \"" + phrase + "\"");
    }

    public void talk() {
        if (canTalk && vocabularySize > 0) {
            System.out.println(getName() + " говорит несколько слов (словарь: " + vocabularySize + ")");
        } else {
            System.out.println(getName() + " молчит или издаёт крики");
        }
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " кричит или щебечет");
    }

    @Override
    public void move() {
        if (isCanFly()) {
            fly();
        } else {
            System.out.println(getName() + " прыгает по жердочке");
        }
    }

    public int getVocabularySize() { 
        return vocabularySize; 
    }
    public void setVocabularySize(int vocabularySize) { 
        this.vocabularySize = vocabularySize; 
    }

    public String getColor() { 
        return color; 
    }
    public void setColor(String color) { 
        this.color = color; 
    }

    public boolean isCanTalk() { 
        return canTalk; 
    }
    public void setCanTalk(boolean canTalk) { 
        this.canTalk = canTalk; 
    }
}