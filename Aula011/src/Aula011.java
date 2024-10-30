public class Aula011 {
    public static void main(String[] args) {

        // Pessoa p1 = new Pessoa; Pessoa é classe abstrata e não pode ser instanciada (ter objetos)
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setIdade(19);
        b1.setCurso("ADS");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        System.out.println(b1.toString());
        b1.renovarBolsa();
        b1.pagarMensalidade();

        Professor pr1 = new Professor("Cardiologia");
        pr1.setNome("Maria");
        pr1.setIdade(30);
        pr1.setSexo("F");
        pr1.setSalario(25000.00F);
        pr1.receberAumento(0.20F);
        System.out.println(pr1.toString());

        Tecnico t1 = new Tecnico(345245678);
        t1.setNome("João");
        t1.setIdade(25);
        t1.setSexo("M");
        t1.setRegistroProfissional(123456789);
        t1.setMatricula(2222);
        t1.setCurso("Enfermagem");
        System.out.println(t1.toString());
        t1.pagarMensalidade();
        t1.praticar();


    }
}