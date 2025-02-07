package entities;

public class Estudante {

    public String nome;
    public Double nota1;
    public Double nota2;
    public Double nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public double pontosParaPassar() {
        if (notaFinal() < 7.0) {
            return 7.0 - notaFinal();
        }
        return 0.0;
    }
}
