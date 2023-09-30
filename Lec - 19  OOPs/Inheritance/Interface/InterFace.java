class InterFace{
    public static void main(String[] args) {
        Tata t1 = new Tata();
        
    }
}

interface car{
    void color();
    void speed();
}

class Tata implements car{
    
    public void color(){
        System.out.println("redds");
    } 
    public void speed(){
        System.out.println("200");
    }
}
class Honda implements car{
    
    public void color(){
        System.out.println("blue");
    } 
    public void speed(){
        System.out.println("100");
    }
}