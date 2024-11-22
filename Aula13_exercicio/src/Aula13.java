public class Aula13 {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro();

        c1.reagir("Olá"); // Abanar e Latir
        c1.reagir("Vai apanhar"); // Grrrrrrrrr
        c1.reagir(11, 45); // Abanar
        c1.reagir(21, 0); // Ignorar
        c1.reagir(true); // Abanar
        c1.reagir(false); // Rosnar e latir
        c1.reagir(2, 12.5f); // Abanar
        c1.reagir(17, 4.5f); // Latir
        c1.reagir(4, 18.5f); // Rosnar
        c1.reagir(19, 6.5f); // Ignorar

    }
}