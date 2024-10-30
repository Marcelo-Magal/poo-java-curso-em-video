public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public final void fazerAniversario() {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

//  @Override No seu caso, você está chamando super.toString() para reutilizar o código do...
    public String toString() {  //...método toString() da superclasse (Aluno) dentro do toString() da subclasse (Professor). Isso não é...
        return "Dados {\n" +  //...sobrescrita — é uma chamada ao método da superclasse. Portanto, você não precisa de @Override para isso.
                "  Nome: " + nome + ",\n" +
                "  Idade: " + idade + ",\n" +
                "  Sexo: " + sexo + "\n" +
                "}";
    }
}
