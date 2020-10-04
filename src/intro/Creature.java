package intro;

public abstract class Creature {
    private int age;
    
<<<<<<< HEAD
    public Creature(int x, int y, int age) {
        this.age = age;
=======
    public Creature(int age) {
    	this.age = age;
>>>>>>> b6f6eeacd104ef599554653e8473f13922e0337c
    }
    
    public void age() {
        age++;
<<<<<<< HEAD
    }    

    public abstract void move();
    public abstract void printInfo();   
    
}
=======
    }
    
    public abstract void move();
    public abstract void printInfo();
}
>>>>>>> b6f6eeacd104ef599554653e8473f13922e0337c
