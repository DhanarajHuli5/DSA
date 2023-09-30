public class StaticPrgm{
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        System.out.println(s1.percentage(97, 97, 87, 67, 68, 75));
        Student1 s2 = new Student1();
        System.out.println(s2.percentage(1, 2, 3, 4, 5, 6));
    }
}

class Student1{
    static String school;
    String name;
    static float percentage(int acc, int eco, int bs, int kan, int eng, int stat){
        return (float)(acc+eco+bs+kan+eng+stat)/6;
    }
    
     void getName(String newName){
        this.name = newName;
    }
    String setName(){
        return this.name;
    }
}
