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

    public CriarReceitaCulinaria(String nome, String autor, String ingredientes, String modoDePreparo, boolean existe) {
        this.nome = nome;
        this.autor = autor;
        this.ingredientes = ingredientes;
        this.modoDePreparo = modoDePreparo;
        this.existe = existe;
    }

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

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipoDeProduto() {
        return TipoDeProduto;
    }

    public void setTipoDeProduto(String tipoDeProduto) {
        TipoDeProduto = tipoDeProduto;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoDePreparo() {
        return modoDePreparo;
    }

    public void setModoDePreparo(String modoDePreparo) {
        this.modoDePreparo = modoDePreparo;
    }

    public String getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(String tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }

    public String getRendimento() {
        return rendimento;
    }

    public void setRendimento(String rendimento) {
        this.rendimento = rendimento;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public boolean isDesatualizada() {
        return desatualizada;
    }

    public void setDesatualizada(boolean desatualizada) {
        this.desatualizada = desatualizada;
    }

    public boolean isTestada() {
        return testada;
    }

    public void setTestada(boolean testada) {
        this.testada = testada;
    }
}
