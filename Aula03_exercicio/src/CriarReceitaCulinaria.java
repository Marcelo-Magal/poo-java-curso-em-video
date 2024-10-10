public class CriarReceitaCulinaria {

    public String nome;
    public String autor;
    public String TipoDeProduto;
    public String ingredientes;
    public String modoDePreparo;
    protected String tempoDePreparo;
    private String rendimento;
    protected String dificuldade;
    private String categoria;
    public String formato;
    protected boolean existe;
    protected boolean desatualizada;
    private boolean testada;

    public void status(){
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
    }

    public void criar() {
        if (existe) {
            System.out.println("Já tenho uma receita de " + this.nome + "." + " Verificar se preciso atualizar.");
        } else {
            System.out.println("Criar uma receita de " + this.nome);
        }

        testar();
    }

    private void testar() {
        if (existe && !desatualizada) {
            testada = true;
            System.out.println("Nem preciso testar, é só publicar");
        } else if (existe) {
            testada = false;
            System.out.println("Preciso atualizar e testar a receita");
        } else {
            testada = false;
            System.out.println("Preciso testar a receita que foi criada e depois publicar");
        }

        publicar();
    }

    private void publicar() {
        if (testada) {
            System.out.println("A receita de " + this.nome + " já está publicada");
        } else {
            System.out.println("Após os testes, a receita de " + this.nome + " será publicada");
        }
    }
}
