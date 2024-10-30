public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
        System.out.println("\n");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public String toString() {
        System.out.println("#### BOLSISTA ####");
        return super.toString() + "\n" +
                "  Bolsa: " + bolsa + "%,\n" +
                "}";
    }
}
