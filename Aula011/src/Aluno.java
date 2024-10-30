public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
        System.out.println("\n");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

//  @Override No seu caso, você está chamando super.toString() para reutilizar o código do...
    public String toString() {  //...método toString() da superclasse (Aluno) dentro do toString() da subclasse (Professor). Isso não é...
        System.out.println("#### ALUNO ####"); //...sobrescrita — é uma chamada ao método da superclasse. Portanto, você não precisa de @Override para isso.
        return super.toString() + ",\n" +
                "Matrícula: " + matricula + ",\n" +
                "Curso: " + curso + "\n" +
                "}";
    }
}
