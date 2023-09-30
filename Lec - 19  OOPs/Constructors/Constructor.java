import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name ="dhanaraj";
        s1.roll = 456;
        s1.passsword ="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        // obj 2 -copid con 1;
        Student s2 = new Student(s1); // - s1 data copied
        s2.passsword = "xyz";
        s1.marks[2] = 100;
        for(int i=0; i<3;i++){
            System.out.print(s2.marks[i]+" ");
        }
    }
} 

class Student{
    String name;
    int roll;
    String passsword;
    int marks[];

    // constructor s2 - copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length;i++){
            this.marks[i] = s1.marks[i]; 
        }
    }
    // constructor s1 
    Student(){
        marks = new int[3];
        System.out.println("constructor is called..");
    }
    
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
}





