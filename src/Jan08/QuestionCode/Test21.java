package Jan08.QuestionCode;




class Person{
    public void talk(){
        System.out.println("I am a Person");
    }
}
class Student extends Person{
    public void talk(){
        System.out.println("I am a Student");
    }
}

public class Test21 {
    public static void main(String args[]) {
        Person p = new Student();
        p.talk();
    }
}