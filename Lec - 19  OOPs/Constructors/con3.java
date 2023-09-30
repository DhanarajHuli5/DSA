

public class con3 {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.name = "dhanaraj";
        s1.roll = 186;
        s1.password = "abcd";

            
    }
}


class Student{
    String name;
    int roll;
    String password;

    Student(){
        System.out.println("construcor is called");
    }


}