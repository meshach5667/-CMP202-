public class tempCodeRunnerFile extends Animal {

    @Override
    String move() {
        return "Swings on tree";
    }

 
    public static void main(String[] args) {

        tempCodeRunnerFile lion = new tempCodeRunnerFile();
        tempCodeRunnerFile monkey = new tempCodeRunnerFile();
    
        monkey.move();
        lion.move();
        System.out.println(monkey.move());
   

    }
}
