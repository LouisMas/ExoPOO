package exo6.fr;

public class Teacher extends Person{

    public Teacher(int age) {
        super(age);
    }

    public void Explain () {

        System.out.println("Explanation begin");
    }
    public void DisplayAge () {

        System.out.println("My age is : " + getAge() + " years old");
    }
}

