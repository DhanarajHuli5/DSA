public class NewAbstraction{
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Lion l1 = new Lion();
        
    }
}

abstract class NewAnimal{
    NewAnimal(){
        System.out.println("base class constructor");
    }
    abstract void run();
}

class Lion extends NewAnimal{
    Lion(){
        System.out.println("1st child constructor");
    }
    void run(){
        System.out.println("Lion runs");
    }
}

class Tiger extends Lion{
    Tiger(){
        System.out.println("2nd child constructor");
    }
    void run(){
        System.out.println("Tiger runs");
    }
}