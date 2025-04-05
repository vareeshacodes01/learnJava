package dailyTask;

// import java.util.Scanner;
// pendingggg-------------------------------------------
public class Inh1 {
    // Scanner sc=new Scanner(System.in);
    class Person{
        string name;
        int age;
        public person(string name, int age){
            this.name=name;
            this.age=age;
        }
        public void display(){
            System.out.println("name of student="+name);
            System.out.println("name of age="+age);
        }
    }
    class Student extends Person{
        string studentId;
        double grade;
        public void student(string studentId, double grade){
            this.studentId=studentId;
            this.grade=grade;
        }

    }

    public static void main(String[] args) {
       

    }
}
