import java.util.Objects;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) {
        if (Objects.equals(frase, "Toma comida") || Objects.equals(frase, "Olá")) {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Grrrrrrrrr");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idade, float peso) {
        if ( idade < 15) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
