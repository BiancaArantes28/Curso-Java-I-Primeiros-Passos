
package alura;

public class TesteDaTurma {
    public static void main(String[] args){
        Turma fj11 = new Turma();
        fj11.alunos = new Aluno[10];
        
        fj11.alunos[0] = new Aluno();
        fj11.alunos[0].nome = "Bianca";
        fj11.alunos[0].nota = 10;
        
        fj11.alunos[1] = new Aluno();
        fj11.alunos[1].nome = "Guilherme";
        fj11.alunos[1].nota = 10;
        
        fj11.imprimeNotas();
        
        
    }
    
}
