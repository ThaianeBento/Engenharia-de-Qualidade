public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void calcularBonus() {
        if (cargo.equals("Gerente")) {
            salario += salario * 0.2;
        } else if (cargo.equals("Analista")) {
            salario += salario * 0.1;
        } else if (cargo.equals("Assistente")) {
            salario += salario * 0.05;
        }
    }

    public void exibirInformacoes() {
        if (cargo.equals("Gerente")) {
            System.out.println("Nome: " + nome + ", Cargo: " + cargo + ", Salário com bônus: " + salario);
        } else if (cargo.equals("Analista")) {
            System.out.println("Nome: " + nome + ", Cargo: " + cargo + ", Salário com bônus: " + salario);
        } else if (cargo.equals("Assistente")) {
            System.out.println("Nome: " + nome + ", Cargo: " + cargo + ", Salário com bônus: " + salario);
        }
    }
}
