public class Fish extends Animal implements Pet{

    Fish()  //Default
    {
        super(0);
    }
    @Override
    public void walk() {
        System.out.println("Fish can't walk. ");
    }

    @Override
    public void eat() {
        System.out.println("Fish eat seaweed. ");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {
        System.out.println("Fish like play around. ");
    }
}
