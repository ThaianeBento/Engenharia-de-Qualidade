public class Assistente extends Funcionario{
    public Assistente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05; // Bônus de 5%
    }
}
