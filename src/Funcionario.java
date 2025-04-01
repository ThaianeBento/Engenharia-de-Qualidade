public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();

    public void exibirInformacoes() {
        double salarioFinal = salario + calcularBonus();
        System.out.println("Nome: " + nome + ", Salário com bônus: " + salarioFinal);
    }

}

