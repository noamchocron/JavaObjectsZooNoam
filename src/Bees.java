public class Bees extends Animal{
    public Bees(String n) {
        super("Stinger", "pollen");
        this.name = n;

    }

    public void sleep() {
        System.out.println(name + " never sleeps");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!" + name + " wants more " + favoriteFood);
            sleep();
        }else {
            System.out.println("YUCK!!!" + name + " will not eat " + food);

        }
    }
}
