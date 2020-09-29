package intro;

public abstract class Creature {
    private int age;
    
    public Creature(int age) {
    	this.age = age;
    }
    
    public void age() {
        age++;
    }
    
    public abstract void move();
    public abstract void printInfo();
}