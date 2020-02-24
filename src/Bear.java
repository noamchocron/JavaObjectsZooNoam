public class Bear extends Animal{
    public Bear(String n) {
        super("Pooh", "fish");
        this.name = n;

    }

    public void sleep() {
        System.out.println(name + " hibernates for 4 months");
    }
}
