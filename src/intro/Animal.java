package intro;

public abstract class Animal extends Creature{
    public Animal(int age) {
        super(age);
    }
    
    @Override
    public void move() {
        System.out.println("4개의 다리를 이용해서 move!!");
    }
}
