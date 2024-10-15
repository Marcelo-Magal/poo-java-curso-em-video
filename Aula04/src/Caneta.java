public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    // Constructor
    public Caneta(String m, String c, float p) {
        this.setModelo(m);
        this.cor = c; // não tem setPonta pq não fiz o setter
        this.setPonta(p);
        this.tampar();
    }

    // Getters and Setters
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta =p;
    }

//    public String getCor() {
//        return this.cor;
//    }
//    public void setCor(String c) {
//        this.cor = c;
//    }

    // Outros métodos
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

}
