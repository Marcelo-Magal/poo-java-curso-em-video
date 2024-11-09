public class Cachorro extends Mamifero {

    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public  void enterrarOsso() {
        System.out.println("Enterrando osso");
    }

    public void abanarRabo() {
        System.out.println("Abanar Rabo");
    }

    @Override
    public String toString() {
        System.out.println("#### CACHORRO ####");
        return super.toString();
    }
}
