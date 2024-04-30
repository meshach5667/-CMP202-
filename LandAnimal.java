public class LandAnimal extends Animal {

    @Override
    String move() {
        return "Swings on tree";
    }

 
    public static void main(String[] args) {

        LandAnimal lion = new LandAnimal();
        LandAnimal monkey = new LandAnimal();
    
        monkey.move();
        lion.move();
        System.out.println(monkey.move());
     

    }

}
