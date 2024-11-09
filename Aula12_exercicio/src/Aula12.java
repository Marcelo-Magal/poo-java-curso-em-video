//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Aula12 {
    public static void main(String[] args) {

//      Animal1 = new Animal() // Não é possível instanciar um objeto de uma classe abstrata
        Mamifero m = new Mamifero(85.3F, 2, 4, "marrom");
        Reptil r = new Reptil(0.5F, 1, 4, "verde");
        Peixe p = new Peixe(0.35F, 1, 0, "cinzenta");
        Ave a = new Ave(0.89F, 2, 2, "branca");

        // Mamífero
//        m.setPeso(85.3F);
//        m.setIdade(2);
//        m.setMembros(4);
//        m.setCorPelo("marrom");
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println(m);



        // Réptil
//        r.setPeso(0.5F);
//        r.setIdade(1);
//        r.setMembros(4);
//        r.setCorEscama("verde");
        r.locomover();
        r.alimentar();
        r.emitirSom();
        r.fazerNinho();
        System.out.println(r.toString());

        // Peixe
//        p.setPeso(0.35F);
//        p.setIdade(1);
//        p.setMembros(0);
//        p.setCorEscama("cinzenta");
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        System.out.println(p.toString());

        // Ave
//        a.setPeso(0.89F);
//        a.setIdade(2);
//        a.setMembros(2);
//        a.setCorPena("branca");
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println(a.toString());

        Canguru c = new Canguru(55.30F, 3, 4, "marrom");
        Cachorro k = new Cachorro(3.94F, 5, 4, "preto");
        Cobra cb = new Cobra(1.5F, 4, 0, "preta");
        Tartaruga t = new Tartaruga(12.5F, 100, 4, "verde");
        GoldFish g = new GoldFish(035F, 1, 0, "dourada");
//        Arara ar = new Arara(1.5F, 5, 2, "azul");

        // Canguru
//        c.setPeso(55.30F);
//        c.setIdade(3);
//        c.setMembros(4);
//        c.setCorPelo("marrom");
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        System.out.println(c.toString());

        // Cachorro
//        k.setPeso(3.94F);
//        k.setIdade(5);
//        k.setMembros(4);
//        k.setCorPelo("preto");
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        k.enterrarOsso();
        System.out.println(k.toString());

        // Cobra
//        cb.setPeso(1.5F);
//        cb.setIdade(4);
//        cb.setMembros(0);
//        cb.setCorEscama("preta");
        cb.locomover();
        cb.alimentar();
        cb.emitirSom();
        cb.fazerNinho();
        System.out.println(cb.toString());

        // Tartaruga
//        t.setPeso(12.5F);
//        t.setIdade(100);
//        t.setMembros(4);
//        t.setCorEscama("verde");
        t.locomover();
        t.alimentar();
        t.emitirSom();
        t.fazerNinho();
        System.out.println(t.toString());

        // Peixe Dourado
//        g.setPeso(0.35F);
//        g.setIdade(1);
//        g.setMembros(0);
//        g.setCorEscama("dourada");
        g.locomover();
        g.alimentar();
        g.emitirSom();
        g.soltarBolha();
        System.out.println(g.toString());

        // Arara
//        ar.locomover();
//        ar.alimentar();
//        ar.emitirSom();
//        ar.fazerNinho();
//        System.out.println(ar.toString());



        // Polimorfismo
        Animal[] animais = new Animal[10];
        animais[0] = new Mamifero(85.3F, 2, 4, "marrom");
        animais[1] = new Reptil(0.5F, 1, 4, "verde");
        animais[2] = new Peixe(0.35F, 1, 0, "cinzenta");
        animais[3] = new Ave(0.89F, 2, 2, "branca");
        animais[4] = new Canguru(55.30F, 3, 4, "marrom");
        animais[5] = new Cachorro(3.94F, 5, 4, "preto");
        animais[6] = new Cobra(1.5F, 4, 0, "preta");
        animais[7] = new Tartaruga(12.5F, 100, 4, "verde");
        animais[8] = new GoldFish(035F, 1, 0, "dourada");
        animais[9] = new Arara(1.5F, 5, 2, "azul");

        // Chamando métodos comuns a todos os animais usando polimorfismo
        animais[9].locomover();
        animais[9].alimentar();
        animais[9].emitirSom();

        // Fazendo um cast para Arara para acessar métodos específicos da subclasse
        if (animais[9] instanceof Arara) {  // Verifica se o objeto é uma instância de Arara
            Arara arara = (Arara) animais[9];
            arara.fazerNinho(); // Método específico da Arara
            System.out.println(arara.toString()); // Representação em string da Arara
        }








    }
}