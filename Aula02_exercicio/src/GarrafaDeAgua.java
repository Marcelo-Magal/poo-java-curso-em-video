public class GarrafaDeAgua {

    String marca;
    String cor;
    double capacidade;
    boolean tampada;
    String tipo;
    String material;
    boolean cheia;
    boolean gelada;

    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Material: " + this.material);
        System.out.println("Cheia: " + this.cheia);
        System.out.println("Gelada: " + this.gelada);
    }

    void encher() {
        if (cheia) {
            System.out.println("Não dá pra encher, a garrafa está cheia.");
        } else {
            System.out.println("Pode encher a garrafa com " + capacidade + "L de água.");
        }
    }

    void destampar() {
        if (tampada) {
            System.out.println("Precisa destampar a garrafa antes de beber.");
        } else {
            System.out.println("A garrafa já está destampada");
        }
    }

    void gelar() {
        if (gelada) {
            System.out.println("Esta geladinha essa água.");
        } else {
            System.out.println("Seria bom dar uma gelada nessa água.");
        }
    }

}
