package training.exercises.javase011.praciceexercise2;

class Intern extends Employee {
    private String university;

    public Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    @Override
    public double calculateBonus() {
        return 500;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("University: " + university);
    }
}
