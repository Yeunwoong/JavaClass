package intro;

public abstract class Animal extends Creature{
    public Animal(int age) {
        super(age);
    }
    
    @Override
    public void move() {
        System.out.println("4���� �ٸ��� �̿��ؼ� move!!");
    }
}
