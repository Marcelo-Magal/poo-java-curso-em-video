public class Aula04 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta("BIC", "azul", 0.5f);

//        c1.setModelo("BIC"); passei na instancia do objeto, pois o constructor pede.
//        c1.modelo = "BIC"; Não pode acessar direto pis é uma classe privada

//        c1.setPonta(0.5f); passei na instancia do objeto, pois o constructor pede.
//        c1.ponta = 0.5f; Não pode acessar direto pis é uma classe privada

        c1.status();
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

        Caneta c2 = new Caneta("Pilot", "Preta", 1.0f);
        c2.destampar();
        c2.status();
    }
}