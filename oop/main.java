/**
 * cmp202
 * main java class
 */


    public class main{
        
    //    cmp202 cmp202 = new cmp202()
    //     cmp202.printUserDetails();
public static void main(String[] args) {
    Person person = new Person();
    person.name = "Jhon";
    person.getName();
    person.setName("David Smith");
    // System.out.println(person.getName());
    
    Person student = new Person("John Doe", "Bingham university", "pass123", "123456");
    Person staff = new Person("Bingham university", "Jane Doe", "pass456",9902);

    System.out.println(student);
    System.out.println(staff);

    Physics physics = new Physics();
    float velocity = physics.velocity(100.0f, 10);
    System.out.println("Velocity: " + velocity + " m/s");
}
}
    // person.password = "12345678";
    
}

       
    }
