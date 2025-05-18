package Atv3;
/**
 *
 * @author vanessa
 */
public class Turma {
    
    Aluno[] alunos;
    int totalAlunos = 0;

    Turma(int tamanho) {
        alunos = new Aluno[tamanho];
    }

    void adicionarAluno(Aluno a) {
        if (totalAlunos < alunos.length) {
            alunos[totalAlunos++] = a;
        }
    }

    void listarAprovados() {
        System.out.println("Alunos aprovados:");
        for (Aluno a : alunos) {
            if (a != null && a.estaAprovado()) {
                System.out.println(a.nome);
            }
        }
    }

    void listarReprovados() {
        System.out.println("Alunos reprovados:");
        for (Aluno a : alunos) {
            if (a != null && !a.estaAprovado()) {
                System.out.println(a.nome);
            }
        }
    }
}
