public class Reptil extends Animal {

    private String corEscama;

    public Reptil(float peso, int idade, int membros, String corEscama) {
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
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Réptil");
    }

    public void fazerNinho() {
        System.out.println("Construí um ninho.");
    }

    @Override
    public String toString() {
        return "==================== Réptil ====================\n" +
                "| Cor da Escama: " + corEscama + "\n" +
                "| Peso:          " + peso + " kg\n" +
                "| Idade:         " + idade + " anos\n" +
                "| Membros:       " + membros + "\n" +
                "==================================================";
    }
}
