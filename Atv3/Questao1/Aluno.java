package Atv3;

/**
 *
 * @author vanessa
 */
public class Aluno {
    String nome;
    String matricula;
    double[] notas = new double[4];
    int countNotas = 0;

    void cadastrarNota(double nota) {
        if (countNotas < 4) {
            notas[countNotas++] = nota;
        } else {
            System.out.println("Máximo de 4 notas atingido.");
        }
    }

    double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < countNotas; i++) {
            soma += notas[i];
        }
        return countNotas > 0 ? soma / countNotas : 0;
    }

    boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }
}

