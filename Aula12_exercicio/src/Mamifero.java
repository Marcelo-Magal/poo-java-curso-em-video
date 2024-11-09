public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;

    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }

    @Override
    public String toString() {
        return "==================== Mamífero ====================\n" +
                "| Cor do Pelo:   " + corPelo + "\n" +
                "| Peso:          " + peso + " kg\n" +
                "| Idade:         " + idade + " anos\n" +
                "| Membros:       " + membros + "\n" +
                "==================================================";
    }
}
