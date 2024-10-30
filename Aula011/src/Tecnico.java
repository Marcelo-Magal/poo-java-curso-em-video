public class Tecnico extends Aluno{
    private int registroProfissional;

    public Tecnico(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("O Governo paga a mensalidade do aluno " + this.getNome());
    }

    public void praticar() {
        System.out.println("Praticando...");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public String toString() {
        System.out.println("#### TÉCNICO ####");
        return super.toString() + "\n" +
                "Registro Profissional: " + registroProfissional + "\n" +
                "}";
    }
}
