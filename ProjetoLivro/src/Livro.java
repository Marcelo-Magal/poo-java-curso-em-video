public class Livro implements Publicacao{
    // Atributos
    private String titulo;
    private String autor;
    private int totalPaginas;
    private  int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Construtor
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    // Métodos Especiais
    public String detalhes() {
        return "Livro {\n" +
                "  Título: '" + titulo + "'\n" +
                "  Autor: '" + autor + "'\n" +
                "  Total de Páginas: " + totalPaginas + "\n" +
                "  Página Atual: " + pagAtual + "\n" +
                "  Aberto: " + (aberto ? "Sim" : "Não") + "\n" +
                "  Leitor:\n" +
                "    Nome: " + leitor.getNome() + "\n" +
                "    Idade: " + leitor.getIdade() + "\n" +
                "    Sexo: " + leitor.getSexo() + "\n" +
                "}" + "\n";
    }


    //Métodos abstratos
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        this.setPagAtual(p);
    }

    @Override
    public void avancarPag() {
        if (this.getAberto()) {
            this.setPagAtual(getPagAtual() + 1);
        } else {
            System.out.println("O livro está fechado, não é possível avançar a página.");
        }
    }

    @Override
    public void voltarPag() {
        if (this.getAberto() && this.getPagAtual() > 0) {
            this.setPagAtual(getPagAtual() - 1);
        } else if (this.getAberto() && this.getPagAtual() == 0) {
            System.out.println("O livro está na primeira página, não é possível voltar a página.");
        } else {
            System.out.println("O livro está fechado, não é possível voltar a página.");
        }
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
