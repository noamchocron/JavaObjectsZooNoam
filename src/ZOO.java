public class ZOO {
    public static void main(String[] args) {
        Tiger Tigger = new Tiger("Tigger");
        Tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn Rarity  = new Unicorn("Rarity");
        Rarity.eat("marshmallows");
        Rarity.eat("meat");
        Giraffe Gemma = new Giraffe("Gemma");
        Gemma.eat("meat");
        Gemma.eat("leaves");
        Bees Stinger = new Bees("Stinger");
        Stinger.eat("ice cream");
        Stinger.eat("pollen");
        Animal[] animals = {Tigger, pooh, Rarity, Gemma, Stinger};
        ZooKeeper z = new ZooKeeper("Noam");
        z.feedAnimals(animals, "steak");

    }
}







//    String favoriteFood = "meat";
//
//    public static void main(String[] args) {
//        ZOO z = new ZOO();
//        z.eat("meat", "tigger");
//        z.eat("bacon", "tigger");
//    }
//
//    public void sleep(String name) {
//        System.out.println(name + " sleeps for 8 hours");
//    }
//
//    public void eat(String food, String name) {
//        System.out.println(name + " eats " + food);
//        if(food.equals(favoriteFood)){
//            System.out.println("YUM!!" + name + " wants more meat");
//        }else {
//            sleep(name);
//        }
//    }



//    public static void main(String[] args) {
//        //make and run a main method
//        Tiger tigger = new Tiger("Tigger");
//        tigger.eat("meat");
//        tigger.eat("kibble");
//
//    }
