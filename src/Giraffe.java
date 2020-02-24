public class Giraffe extends Animal{
    public Giraffe(String n) {
        super("Gemma", "leaves");
        this.name = n;

    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!" + name + " wants more " + favoriteFood);
            sleep();
        }else {
            System.out.println("YUCK!!" + name + " will not eat " + food);

        }
    }
}