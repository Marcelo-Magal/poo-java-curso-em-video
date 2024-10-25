public class ControleRemoto implements Controlador {

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Construtor
    public ControleRemoto() {

        setVolume(50);
        setLigado(false);
        setTocando(false);

    }

    // Getters e Setters
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Ligando a TV");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setTocando(false);
        System.out.println("Desligando a TV");
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("Está LIGADO? " + this.getLigado());
            System.out.println("Está TOCANDO? " + this.getTocando());
            System.out.println("VOLUME: " + this.getVolume());
            for (int i = 0; i < this.getVolume(); i+=10) {
                System.out.print("|");
            }
            System.out.println();
        } else {
            System.out.println("Impossível abri o MENU. A TV está DESLIGADA");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()) {
            System.out.println("Fechando MENU.");
        } else {
            System.out.println("Impossível fechar o MENU. A TV está DESLIGADA.");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar o VOLUME. A TV está DESLIGADA.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir o VOLUME. A TV está DESLIGADA.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
            System.out.println("PLAY");
        } else {
            System.out.println("Impossível dar PLAY o VOLUME. A TV está DESLIGADA.");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
            System.out.println("PAUSE");
        } else {
            System.out.println("Impossível PAUSAR. A TV está DESLIGADA.");
        }
    }
}
