public class AquaticAnimals extends Animal{
    @Override
    String move(){
        return "can swim";
    }
    public static void main(String[] args) {
        AquaticAnimals fish = new AquaticAnimals();
        fish.move();
        System.out.println(fish.move());
    }
}
