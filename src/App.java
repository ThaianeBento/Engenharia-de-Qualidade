public class App {

    public class Main {
        public static void main(String[] args) {
            Funcionario gerente = new Gerente("Carlos", 5000);
            Funcionario analista = new Analista("Juliana", 3000);
            Funcionario assistente = new Assistente("Ana", 2000);

            gerente.exibirInformacoes();
            analista.exibirInformacoes();
            assistente.exibirInformacoes();
        }
    }
}
