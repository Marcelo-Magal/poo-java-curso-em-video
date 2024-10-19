public class GarrafaDeAgua {

    public String marca;
    public String cor;
    public double capacidade;
    private boolean tampada;
    protected String tipo; //  pode usar o atributo protegido pq está em uma classe que utiliza a classe GarafaDeAgua.
    protected String material; //  pode usar o atributo protegido pq está em uma classe que utiliza a classe GarafaDeAgua.
    protected boolean cheia;
    private boolean gelada;

    public void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Material: " + this.material);
        System.out.println("Cheia: " + this.cheia);
        System.out.println("Gelada: " + this.gelada);
    }

    public void encher() {
        if (cheia) {
            System.out.println("Não dá pra encher, a garrafa está cheia.");
        } else {
            System.out.println("Pode encher a garrafa com " + capacidade + "L de água.");
        }

        destampar();
    }

    private void destampar() {
        if (tampada) {
            System.out.println("Precisa destampar a garrafa antes de beber.");
        } else {
            System.out.println("A garrafa já está destampada");
        }
    }

    protected void gelar() {
        if (gelada) {
            System.out.println("Esta geladinha essa água.");
        } else {
            System.out.println("Seria bom dar uma gelada nessa água.");
        }
    }

}
