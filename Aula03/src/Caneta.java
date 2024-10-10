public class Caneta {

        public String modelo;
        public String cor;
        private float ponta;
        protected int carga;
        private boolean tampada;

        public void status() {
                System.out.println("Modelo: " + this.modelo);
                System.out.println("Uma caneta " + this.cor);
                System.out.println("Ponta: " + this.ponta);
                System.out.println("Carga: " + this.carga);
                System.out.println("Está tampada? " + this.tampada);
        }

        protected void rabiscar() {
                if (this.tampada == true) {
                        System.out.println("ERRO, não posso rabiscar");
                } else {
                        System.out.println("Estou rabiscando");
                }
        }

        public void tampar() {

                this.tampada = true;
        }

        public void destampar() {

                this.tampada = false;
        }
}

/* Apesar de o atributo tampada ser privado (private), ainda é possível alterá-lo por meio dos métodos tampar() e destampar(),
 que são públicos (public). Isso acontece porque, mesmo que um atributo privado não seja acessível diretamente por outras classes,
 ele pode ser modificado indiretamente através de métodos públicos. Esses métodos, como tampar() e destampar(), fazem parte
 da própria classe Caneta e, portanto, têm permissão para modificar o atributo privado dentro da classe. Assim, o controle
 de acesso é mantido, mas o comportamento da caneta (se está tampada ou não) pode ser controlado de forma segura por quem usa o objeto.
 Em resumo: tampada é privado, logo, não pode ser acessado diretamente por outras classes.
 Os métodos tampar() e destampar() são públicos, permitindo que o estado de tampada seja alterado indiretamente,
 respeitando o encapsulamento da classe. */