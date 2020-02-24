public class ZooKeeper {
    String name;

    public ZooKeeper(String z) {
        this.name = z;
    }

    public void feedAnimals( Animal[] animals, String food){
        System.out.println(name + " is feeding " + food + " to " + animals.length + " animals out of " + Animal.population);
        for( int i=0; i< animals.length; i++){
            animals[i].eat(food);
        }

    }
}
