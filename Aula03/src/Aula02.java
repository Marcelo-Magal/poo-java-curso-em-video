public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
//        c1.ponta = 0.5; é privado, não pode ser alterada fora da classe.
        c1.carga = 80; // pode usar o atributo protegido pq está em uma classe que utiliza a classe caneta.
//        c1.tampada = true; // pode usar o atributo protegido pq está em uma classe que utiliza a classe caneta.
        c1.status();
        c1.rabiscar();
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();

    }

}
