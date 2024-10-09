public class CriarReceitaCulinaria {

    String nome;
    String autor;
    String TipoDeProduto;
    String ingredientes;
    String modoDePreparo;
    String tempoDePreparo;
    String rendimento;
    String dificuldade;
    String categoria;
    String formato;
    boolean existe;
    boolean desatualizada;
    boolean publicada;

    void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Tipo de Produto: " + this.TipoDeProduto);
        System.out.println("Ingredientes: " + this.ingredientes);
        System.out.println("Modo de Preparo: " + this.modoDePreparo);
        System.out.println("Tempo de Preparo: " + this.tempoDePreparo);
        System.out.println("Rendimento: " + this.rendimento);
        System.out.println("Dificuldade: " + this.dificuldade);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Formato: " + this.formato);
        System.out.println("Existe: " + this.existe);
        System.out.println("Desatualizada: " + this.desatualizada);
        System.out.println("Publicada: " + this.publicada);
    }

    void criar() {
        if (existe) {
            System.out.println("Já tenho uma receita de " + this.nome + "." + " Verificar se preciso atualizar.");
        } else {
            System.out.println("Criar uma receita de " + this.nome);
        }
    }

    void testar() {
        if (existe && !desatualizada) {
            System.out.println("Nem preciso testar, é só publicar");
        } else if (existe) {
            System.out.println("Preciso atualizar e testar a receita");
        } else {
            System.out.println("Preciso testar a receita que foi criada e depois publicar");
        }
    }

    void publicar() {
        if (!publicada) {
            System.out.println("Agora posso publicar a receita de " + this.nome);
        } else {
            System.out.println("Não precisa, receita de " + this.nome + " já publicada");
        }
    }
}
