import java.util.*;

public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");

        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newCol) {
        color = newCol;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    int marks;

    void setName(String newName) {
        name = newName;
    }

    void setAge(int newAge) {
        age = newAge;
    }

    void setMarks(int newMarks) {
        marks = newMarks;
    }
}