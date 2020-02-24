public class Unicorn extends Animal{
    public Unicorn(String n) {
        super("Rarity", "marshmallows");
        this.name = n;

    }

    public void sleep() {
        System.out.println(name + " sleeps in a cloud");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!" + name + " wants more " + favoriteFood);
            sleep();
        }else {
            sleep();
        }
    }
}

