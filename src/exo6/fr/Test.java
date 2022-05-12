package exo6.fr;

public class Test {

    public static void main(String[] args) {

        Person person = new Person(20);
        person.sayHello();

        Student student = new Student(15);
        student.DisplayAge();
        student.GoToClasses();

        Teacher teacher = new Teacher(40);
        teacher.sayHello();
        teacher.Explain();


    }
}
