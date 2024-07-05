import java.util.*;

public class Turma {
    private Map<Integer, Pessoa> alunos = new LinkedHashMap<>();

    public void adicionarAluno(int numeroAluno, Pessoa aluno){
        alunos.put(numeroAluno, aluno);

        public Pessoa buscarAluno(int numeroAluno) throws Exception{
            Pessoa pessoa = this.Alunos.get(numeroAluno);
            if (pessoa == null) {
                throw new Exception("Aluno nao encontrado!");
            }

            return pessoa;
        }
    }
}
