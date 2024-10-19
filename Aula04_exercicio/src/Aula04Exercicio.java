public class Aula04Exercicio {

    public static void main(String[] args) {

        GarrafaDeAgua g1 = new GarrafaDeAgua();
        g1.marca = "Nova Água";
        g1.cor = "Azul";
        g1.capacidade = 0.5;
//        g1.tampada = true; não pode ser acessado diretamente pq é privado
        g1.tipo = "natural";
        g1.material = "plástico";
        g1.cheia = true;
//        g1.gelada = false; não pode ser acessado diretamente pq é privado

        g1.status();
        g1.encher();
//        g1.destampar(); não pode ser acessado diretamente pq é privado
        g1.gelar();

        GarrafaDeAgua g2 = new GarrafaDeAgua();
        g2.marca = "Borbulhas";
        g2.cor = "Vermelha";
        g2.capacidade = 1;
//        g2.tampada = false; não pode ser acessado diretamente pq é privado
        g2.tipo = "Gaseificada";
        g2.material = "Vidro";
        g2.cheia = false;
//        g2.gelada = true; não pode ser acessado diretamente pq é privado

        g2.status();
        g2.encher();
//        g2.destampar(); não pode ser acessado diretamente pq é privado
        g2.gelar();

        CriarReceitaCulinaria r1 = new CriarReceitaCulinaria(
                "Bolo de Cenoura",
                "Maria",
                "Cenoura, açúcar, farinha de trigo, ovos, óleo, fermento",
                "Bater tudo no liquidificador, colocar em forma untada e levar ao forno",
                true
        );

//        r1.nome = "Bolo de Cenoura"; passei na instancia do objeto, pois o constructor pede.
//        r1.autor = "Maria"; passei na instancia do objeto, pois o constructor pede.
        r1.TipoDeProduto = "Doce";
//        r1.ingredientes = "Cenoura, açúcar, farinha de trigo, ovos, óleo, fermento"; passei na instancia do objeto, pois o constructor pede.
//        r1.modoDePreparo = "Bater tudo no liquidificador, colocar em forma untada e levar ao forno"; passei na instancia do objeto, pois o constructor pede.
        r1.tempoDePreparo = "40 minutos";
//        r1.rendimento = "12 porções"; é privado, não pode ser alterada fora da classe.
        r1.dificuldade = "Fácil";
//        r1.categoria = "Bolos"; é privado, não pode ser alterada fora da classe.
        r1.formato = "Texto";
//        r1.existe = true; passei na instancia do objeto, pois o constructor pede.
        r1.desatualizada = false;
//        r1.publicada = true; é privado, não pode ser alterada fora da classe.

        r1.status();
        r1.criar();
//        r1.testar(); é privado, não pode ser acessado diretamente pq é privado
//        r1.publicar();

        CriarReceitaCulinaria r2 = new CriarReceitaCulinaria(
                "Pão de Queijo",
                "João",
                "Polvilho, queijo, leite, óleo, ovos",
                "Misturar tudo, fazer bolinhas e levar ao forno",
                false
        );

//        r2.nome = "Pão de Queijo"; passei na instancia do objeto, pois o constructor pede.
//        r2.autor = "João"; passei na instancia do objeto, pois o constructor pede.
        r2.TipoDeProduto = "Salgado";
//        r2.ingredientes = "Polvilho, queijo, leite, óleo, ovos"; passei na instancia do objeto, pois o constructor pede.
//        r2.modoDePreparo = "Misturar tudo, fazer bolinhas e levar ao forno"; passei na instancia do objeto, pois o constructor pede.
        r2.tempoDePreparo = "30 minutos";
//        r2.rendimento = "20 porções"; é privado, não pode ser alterada fora da classe.
        r2.dificuldade = "Fácil";
//        r2.categoria = "Pães"; é privado, não pode ser alterada fora da classe.
        r2.formato = "Texto";
//        r2.existe = false; passei na instancia do objeto, pois o constructor pede.
        r2.desatualizada = true;
//        r2.publicada = false; é privado, não pode ser alterada fora da classe.

        r2.status();
        r2.criar();
//        r2.testar();
//        r2.publicar();

    }
}
