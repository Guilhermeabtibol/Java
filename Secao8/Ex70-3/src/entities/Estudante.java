package entities;

public class Estudante {

    public String name;
    public Double grade1;
    public Double grade2;
    public Double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double quantosPontosFaltam() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
}
