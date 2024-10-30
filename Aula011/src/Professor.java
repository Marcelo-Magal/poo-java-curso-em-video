public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public Professor(String especialidade) {
        this.especialidade = especialidade;
    }

    public void receberAumento(float aumento) {
        this.salario += this.salario * aumento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

//  @Override No seu caso, você está chamando super.toString() para reutilizar o código do...
    public String toString() {  //...método toString() da superclasse (Aluno) dentro do toString() da subclasse (Professor). Isso não é...
        System.out.println("#### PROFESSOR ####"); //...sobrescrita — é uma chamada ao método da superclasse. Portanto, você não precisa de @Override para isso.
        return  super.toString() + "\n" +
                "  Especialidade: " + especialidade + ",\n" +
                "  Salário: " + salario + "\n" +
                "}" + "\n";
    }
}
