public class Canguru extends Mamifero {

    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    public void usarBolsa() {
        System.out.println("Usando a bolsa");
    }
    
    @Override
    public String toString() {
        System.out.println("#### CANGURU ####");
        return super.toString();
    }
}
