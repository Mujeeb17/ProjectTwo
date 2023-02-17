/*
2. We have to calculate the average of marks obtained in three
subjects by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage of marks.
Provide implementation of abstract method in classes 'A' and 'B'. The constructor
of student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code
 */
public abstract class Marks {

    double math, science, history;

    public Marks(double math, double science, double history) {
        this.math = math;
        this.science = science;
        this.history = history;
    }

    abstract double getPercentage();
}
class StudentA extends Marks{
    public StudentA(double math, double science, double history) {
        super(math, science, history);
    }

    @Override
    double getPercentage() {
        return (math + science + history) / 3;
    }
}
class StudentB extends Marks{

    double credit;
    public StudentB(double math, double science, double history, double credit) {
        super(math, science, history);
        this.credit = credit;
    }

    @Override
    double getPercentage() {
        return (math + science + history + credit) / 4;
    }
}

class MarksTester {
    public static void main(String[] args) {

        StudentA a = new StudentA(67.5, 98, 75.1);
        System.out.println("Student A avg: " + a.getPercentage());

        StudentB b = new StudentB(87.9, 76.8, 45.8, 60);
        System.out.println("Student B avg: " + b.getPercentage());
    }
}