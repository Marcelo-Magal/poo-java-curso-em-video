public class Cobra extends Reptil {

    public Cobra(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public String toString() {
        System.out.println("#### COBRA ####");
        return super.toString();
    }
}
