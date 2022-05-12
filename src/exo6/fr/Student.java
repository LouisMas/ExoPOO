package exo6.fr;

public class Student extends Person {

    public Student(int age) {
        super(age);
    }

    public void GoToClasses () {
        System.out.println("I'm going to class");
    }

    public void DisplayAge () {

        System.out.println("My age is : " + getAge() + "years old");
    }

}
