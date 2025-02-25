import exe1.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        //instancia um aluno
        Aluno obj1 = new Aluno();
        System.out.println("Media do aluno "+ obj1.nome + " é " + obj1.notaFinal());
        Aluno obj2 = new Aluno(123, "Pedro", 19, 7.5f, 9.0f);
        System.out.println("Media do aluno " + obj2.nome + " é " + obj2.notaFinal());
        obj2.dadosAluno();

    }
}
