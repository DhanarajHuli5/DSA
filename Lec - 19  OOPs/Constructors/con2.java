
class a {
    String name;
    int roll;
    int age;

    a(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }

    a(int newAge, int newRoll) {
        this.age = newAge;
        this.roll = newRoll;
    }

    a(String newName, int newRoll, int newAge) {
        this.name = newName;
        this.roll = newRoll;
        this.age = newAge;
    }

}

public class con2 {
    public static void main(String[] args) {
        a stu1 = new a("dhanaraj", 19);
        a stu2 = new a(19, 186);
        a stu3 = new a("dhanaraj", 186, 19);
    }
}
