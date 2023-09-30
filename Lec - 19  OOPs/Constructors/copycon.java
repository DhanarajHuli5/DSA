public class copycon {
    public static void main(String[] args) {
        stu s1 = new stu();
        s1.name ="tony";
        s1.rollNo =1;
        s1.age= 56;
        s1.passsword = 3000;
        s1.marks[0] = 99;
        s1.marks[1]=98;
        s1.marks[2]=97;
        stu s2 = new stu(s1);    
        for(int i=0;i<s1.marks.length;i++){
            System.out.println(s2.marks[i]);
        }
        s1.marks[0]=101;
        s1.marks[1] = 200;
        for(int i=0;i<s1.marks.length;i++){
            System.out.println(s2.marks[i]);
        }
        System.out.println("marks of s1  "+ s1.marks[0]);
        System.out.println("marks of s2  "+ s2.marks[0]);
    }
}
class stu {
    String name;
    int rollNo; 
    int age;
    int passsword;
    int marks[];
    stu(){  
        marks = new int[3];
        // default constructor
    }
    // copy constructor 
    // stu(stu s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     this.age = s1.age;
    //     this.passsword = s1.passsword;
    //     this.marks= s1.marks;
    // }

    //deep constructor
    stu(stu s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.age = s1.age;
        this.passsword = s1.passsword;
        for(int i=0;i<s1.marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
}

