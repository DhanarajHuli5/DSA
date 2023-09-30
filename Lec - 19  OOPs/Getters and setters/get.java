public class get {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
    }
}

class pen{
    private String color;
    
    void setColor(String col){
        this.color = col;
    }
    String getColor(){
        return this.color;
    }
}
