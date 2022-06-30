public class SQLFactory{
    public static void main(String[] args){

        Aluno aluno = new Aluno();
        
        // Database.abrirID(aluno, 2);
        //System.out.println("CONSUNTANDO DADOS INSERIDOS");
        // System.out.println("Nome: " + aluno.nome + ", Idade: " + aluno.idade + ", Cidade: " + aluno.cidade + ", UF" + aluno.uf );
        
        aluno.id = 4;
        aluno.nome = "Marcelo";
        aluno.idade = 50;
        aluno.cidade = "Sinop";
        aluno.uf = "MT";

        System.out.println("INSERINDO DADOS");
        System.out.println(aluno.insertSQL());
        
        // Database.abrirID(aluno, 2);
        // System.out.println("CONSUNTANDO DADOS INSERIDOS");
        // System.out.println("Nome: " + aluno.nome + ", Idade: " + aluno.idade + ", Cidade: " + aluno.cidade + ", UF" + aluno.uf );

        // aluno.id = 1;
        // aluno.nome = "Marcelo Linck";
        // aluno.idade = 38;
        // aluno.cidade = "Sinop";
        // aluno.uf = "MT";

        // System.out.println("ATUALIZANDO DADOS");
        // System.out.println(aluno.updateSQL());
    }
}