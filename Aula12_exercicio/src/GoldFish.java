public class GoldFish extends Peixe {

    public GoldFish(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public void locomover() {
        System.out.println("Nadando rapidinho");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo ração de peixe");
    }

    @Override
    public String toString() {
        System.out.println("#### GOLDFISH ####");
        return super.toString();
    }
}
