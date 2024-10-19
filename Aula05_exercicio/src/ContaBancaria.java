public class ContaBancaria {

    private static int contadorDeContas = 0;
    public int numeroConta;
    protected String tipoConta;
    private String nomeTitular;
    private float saldoConta;
    private boolean statusConta;

    //Constructor
    public ContaBancaria() {
        this.numeroConta = 0;
        this.tipoConta = "cc";
        this.nomeTitular = "";
        this.saldoConta = 0.00F;
        this.statusConta = false;
    }

    //Getters and Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    public void abrirConta(String titular, String tipo, float depositoInicial) {
        setStatusConta(true);
        setNumeroConta(++contadorDeContas);
        setNomeTitular(titular);
        setTipoConta(tipo);
        setSaldoConta(depositoInicial);

        if (getStatusConta()) {
            float bonusCP = 150.00F;
            float bonusCC = 50.00F;

            if ("cp".equals(getTipoConta())) {
                setSaldoConta(getSaldoConta() + bonusCP);
                System.out.println(
                        "Conta aberta com sucesso para o titular " + getNomeTitular() +
                                " com depósito inicial de " + depositoInicial +
                                " e bônus de " + bonusCP + "."
                );
            } else if ("cc".equals(getTipoConta())) {
                setSaldoConta(getSaldoConta() + bonusCC);
                System.out.println(
                        "Conta aberta com sucesso para o titular " + getNomeTitular() +
                                " com depósito inicial de " + depositoInicial +
                                " e bônus de " + bonusCC + "."
                );
            } else {
                System.out.println("Tipo de conta inválido.");
                setStatusConta(false);
            }
        }
    }


    public void fecharConta() {
        if (getStatusConta()) {
            if (getSaldoConta() == 0F) {
                setStatusConta(false);
                System.out.println("Sua conta foi encerrada.");
                System.out.println(" ");
            } else if (getSaldoConta() < 0) {
                System.out.println("Vc precisa zerar o saldo da conta primeiro. Deposite " + getSaldoConta());
            } else {
                System.out.println("Vc precisa zerar o saldo da conta primeiro. Saque " + getSaldoConta());
            }
        }
    }

    public void depositar(float deposito) {
        if (getStatusConta() && deposito > 0) {
            setSaldoConta(getSaldoConta() + deposito);
            System.out.println("Depósito de " + deposito + " realizado.");
        } else {
            System.out.println("Depósito não realizado. Conta inativa.");
        }
    }

    public void sacar(float saque) {
        if (getStatusConta() && saque > 0 && saque <= getSaldoConta()) {
            setSaldoConta(getSaldoConta() - saque);
            System.out.println("Saque realizado no valor de " + saque + ".");
            System.out.println("Saldo atual: " + getSaldoConta());
        } else if (saque > getSaldoConta()) {
            System.out.println("Vc não tem saldo suficiente para sacar " + saque + ".");
            System.out.println("Saldo atual: " + getSaldoConta());
        } else {
            System.out.println("Depósito não realizado. Conta inativa.");
        }
    }

    public void pagarMensalidade() {
        float tarifaMensal;

        if ("cc".equals(getTipoConta())) {
            tarifaMensal = 12.00F;
            if (getSaldoConta() >= tarifaMensal) {
                setSaldoConta(getSaldoConta() - tarifaMensal);
                System.out.println("Tarifa mensal de " + tarifaMensal + " paga.");
            } else {
                System.out.println("Vc não tem saldo para pagar a mensalidade de " + tarifaMensal);
            }
        } else if ("cp".equals(getTipoConta())) {
            tarifaMensal = 20.00F;
            if (getSaldoConta() >= tarifaMensal) {
                setSaldoConta(getSaldoConta() - tarifaMensal);
                System.out.println("Tarifa mensal de " + tarifaMensal + " paga.");
            } else {
                System.out.println("Vc não tem saldo para pagar a mensalidade de " + tarifaMensal);
            }
        }
    }

    public void infosConta() {
        System.out.println(" ");
        System.out.println("Número da conta: " + getNumeroConta());
        System.out.println("Tipo da conta: " + getTipoConta());
        System.out.println("Nome do titular: " + getNomeTitular());
        System.out.println("Saldo da conta: " + getSaldoConta());
        System.out.println("Status da conta: " + getStatusConta());
    }


}
