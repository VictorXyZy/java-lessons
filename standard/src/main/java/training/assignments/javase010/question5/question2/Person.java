package training.assignments.javase010.question5.question2;

public class Person {

    private String name;

    Person(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
        } else
            this.name = name;
    }

}
