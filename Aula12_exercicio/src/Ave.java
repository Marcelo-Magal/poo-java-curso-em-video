public class Ave extends Animal {

    protected String corPena;

    public Ave(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    public void fazerNinho() {
        System.out.println("Construí um ninho.");
    }

    @Override
    public String toString() {
        return "==================== Ave ====================\n" +
                "| Cor da Pena:   " + corPena + "\n" +
                "| Peso:          " + peso + " kg\n" +
                "| Idade:         " + idade + " anos\n" +
                "| Membros:       " + membros + "\n" +
                "==================================================";
    }
}
