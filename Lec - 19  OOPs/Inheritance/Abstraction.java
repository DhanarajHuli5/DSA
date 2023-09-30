
public class Abstraction {
    public static void main(String[] args) {
        
        
    }
}
// - - - - - - - - - - - - - - - - - - - - - 
//     BASE CLASS
abstract class Animal{
    String color;
    Animal(){
        color = "red";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}  
//      DERIVED CLASS
class Horse extends Animal{
    void changeColor(){
        color = "blue";
    }
    void walk(){
        System.out.println("walks on 4 legs ");
    }
    
}
//      DERIVED CLASS
class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}