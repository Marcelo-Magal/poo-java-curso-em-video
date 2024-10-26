import java.util.Objects;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos Especiais
    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    // Getters e Setters
    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador df) {
        this.desafiante = df;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {                    // Objects.equals(l1.getCategoria(), l2.getCategoria())
        if (Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2) { // é mesma coisa que == só que null safe.
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            this.setAprovada(true);
            System.out.println("\nA luta vai acontecer:");
        } else {
            this.setDesafiado(null);
            this.setDesafiante(null);
            this.setAprovada(false);
            System.out.println("\nA luta não vai acontecer...");

            if (l1 == l2) {
                System.out.println("UM LUTADOR NÃO PODE LUTAR COM ELE MESMO!");
            } else {
                System.out.println("POR DIFERENÇAS DE CATEGORIA!");
            }
        }
    }

    public void lutar() {
        if (this.getAprovada() && this.getDesafiado() != this.getDesafiante()) {
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();

            int vencedor = (int) (Math.random() * 3);
            switch (vencedor) {
                // Empate
                case 0 -> {
                    System.out.println("Empatou!");
                    getDesafiado().empatarLuta();
                    getDesafiante().empatarLuta();
                }
                // Vitória Desafiado
                case 1 -> {
                    System.out.println("Vitória do Desafiante");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                }
                // Vitória Desafiante
                case 2 -> {
                    System.out.println("Vitória do Desafiado");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                }
            }
            // Exibe o status dos lutadores após a luta para confirmar a atualização
            System.out.println("\n####### PÓS LUTA #######");
            System.out.println("### STATUS DO DESAFIADO ###");
            this.desafiado.status();
            System.out.println("### STATUS DO DESAFIANTE ###");
            this.desafiante.status();
        }
    }
}
