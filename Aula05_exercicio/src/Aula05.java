public class Aula05 {

    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria();
        cb1.abrirConta("Jubileu", "cp", 300.00F);
        cb1.depositar(33.00F);
        cb1.infosConta();
        cb1.pagarMensalidade();
        cb1.infosConta();
        cb1.fecharConta();
        cb1.sacar(463.00F);
        cb1.infosConta();
        cb1.fecharConta();


        ContaBancaria cb2 = new ContaBancaria();
        cb2.abrirConta("Creuza", "cc", 500.00F);
        cb2.infosConta();
        cb2.pagarMensalidade();
        cb2.infosConta();
        cb2.sacar(700.00F);
        cb2.sacar(533.00F);
        cb2.pagarMensalidade();
        cb2.fecharConta();



        }
}