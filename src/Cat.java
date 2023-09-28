import org.w3c.dom.ls.LSOutput;

public class Cat extends Animal implements Pet{

    private String name;
    Cat(String name)
    {
        super(4);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating. ");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing. ");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
