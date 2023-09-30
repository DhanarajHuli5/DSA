import java.util.Scanner;

public class ifelse {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float n = sc.nextFloat();
    
    if(n<=5){
        System.out.println(n);
    } else if(n>5 || n<=10){
        System.out.println(n*0.2);
    } else if(n>10 || n<=20){
        System.out.println(n*0.3);
    }
    else{
        System.out.println("tu to bahot hi amir ho bhai");
    }
   } 

}
