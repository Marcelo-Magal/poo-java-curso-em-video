public class Arara extends Ave {

    public Arara(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros, corPena);
    }

    public void falando() {
        System.out.println("Arara falando");
    }

    @Override
    public void locomover() {
        System.out.println("Voando como uma Arara");
    }

    @Override
    public String toString() {
        System.out.println("#### ARARA ####");
        return super.toString();
    }
}
