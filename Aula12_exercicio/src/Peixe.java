public class Peixe extends Animal {

    private String corEscama;

    public Peixe(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }

    @Override
    public String toString() {
        return "==================== Peixe ====================\n" +
                "| Cor da Escama: " + corEscama + "\n" +
                "| Peso:          " + peso + " kg\n" +
                "| Idade:         " + idade + " anos\n" +
                "| Membros:       " + membros + "\n" +
                "==================================================";
    }
}
