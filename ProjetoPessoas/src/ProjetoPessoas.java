public class ProjetoPessoas {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        // Configuração dos nomes
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);

        // Configuração de curso, salário e setor
        p2.setCurso("Informática");      // Específico de Aluno
        p3.setSalario(2500.75);           // Específico de Professor
        p4.setSetor("Estoque");           // Específico de Funcionario

        // Chamadas de métodos específicos
        p3.receberAum(550.20f);           // Método específico de Professor
        p4.mudarTrabalho();               // Método específico de Funcionario
        p2.cancelarMatricula();               // Método específico de Aluno

        // p1.receberAum(550.20f);           // Métodos no contexto errado
        // p2.mudarTrabalho();               // Métodos no contexto errado
        // p4.cancelarMatricula();           // Métodos no contexto errado

        System.out.println("Dados de p1:" + p1.toString());
        System.out.println("Dados de p2:" + p2.toString());
        System.out.println("Dados de p3:" + p3.toString());
        System.out.println("Dados de p4:" + p4.toString());

    }
}