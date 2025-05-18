package Atv3;
import java.util.Scanner;
/**
 *
 * @author vanessa
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int qtdAlunos = sc.nextInt();
        sc.nextLine(); 

        Turma turma = new Turma(qtdAlunos);

        for (int i = 0; i < qtdAlunos; i++) {
            Aluno aluno = new Aluno();

            System.out.println("\nCadastro do " + (i + 1) + "º aluno:");
            System.out.print("Nome: ");
            aluno.nome = sc.nextLine();

            System.out.print("Matrícula: ");
            aluno.matricula = sc.nextLine();

        int qtdNotas;
            do {
            System.out.print("Quantas notas deseja inserir (entre 1 e 4)? ");
            qtdNotas = sc.nextInt();
              if (qtdNotas < 1 || qtdNotas > 4) {
              System.out.println("Quantidade inválida. Tente novamente.");
              }
            } while (qtdNotas < 1 || qtdNotas > 4);


            for (int j = 0; j < qtdNotas && j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                double nota = sc.nextDouble();
                aluno.cadastrarNota(nota);
            }

            sc.nextLine();
            turma.adicionarAluno(aluno);
        }

        turma.listarAprovados();
        turma.listarReprovados();
    }
}